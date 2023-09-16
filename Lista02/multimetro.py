import math

def main():
    values = []
    sumValues = 0
    vSum = 0
    
    for i in range(10):
        value = float(input(f"Digite a {i + 1}ª medição de temperatura: "))
        values.append(value)
        sumValues += value

    average = sumValues / len(values)

    print("\nTEMPERATURAS:")
    for value in values:
        v = abs(value - average)
        vSum += v * v
        print(f"{value: .2f}\t")

    variance = vSum / len(values)
    print(f"\nVALOR MÉDIO: {average: .2f}")
    print(f"DESVIO PADRÃO: {math.sqrt(variance): .2f}")
    print(f"ESTADO DO MULTÍMETRO: {'Com problemas' if (math.sqrt(variance) > 0.1 * average) else 'Funcionando!'}")

if __name__ == "__main__":
    main()