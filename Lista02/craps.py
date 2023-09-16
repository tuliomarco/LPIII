import random

def main():
    d1 = random.randint(1, 6)
    d2 = random.randint(1, 6)
    sumD = d1 + d2

    print(f"Dado 1: {d1}, Dado 2: {d2}")
    print(f"Ponto: {sumD}\n")

    if sumD == 7 or sumD == 11:
        print("Você venceu :-)\n")
    elif sumD == 2 or sumD == 3 or sumD == 12:
        print("Você perdeu :-(\n")
    else:
        print("\nIniciando estágio 2")
        point = sumD
        rounds = 1

        while True:
            d1 = random.randint(1, 6)
            d2 = random.randint(1, 6)
            sum = d1 + d2
            rounds += 1

            print(f"\nDado 1: {d1}, Dado 2: {d2}")
            print(f"Jogada {rounds}: {sumD}")

            if sum == point:
                print("\nVocê ganhou :-)")
                break
            elif sum == 7:
                print("\nVocê perdeu :-(")
                break

if __name__ == "__main__":
    main()