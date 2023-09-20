
errorText = "\033[31m"
normalText = "\033[0m"
boldText = "\033[1m"
successText = "\033[32m"

def main():

    banner = '''
__        __   _                            _          ____        _   _   _           _     _       _ _ _ 
\\ \\      / /__| | ___ ___  _ __ ___   ___  | |_ ___   | __ )  __ _| |_| |_| | ___  ___| |__ (_)_ __ | | | |
 \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  |  _ \\ / _` | __| __| |/ _ \\/ __| '_ \\| | '_ \\| | | |
  \\ V  V /  __/ | (_| (_) | | | | | |  __/ | || (_) | | |_) | (_| | |_| |_| |  __/\\__ \\ | | | | |_) |_|_|_|
   \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |____/ \\__,_|\\__|\\__|_|\\___||___/_| |_|_| .__/(_|_|_)
                                                                                              |_|        
    '''

    print(banner)

    board1 = []
    board2 = []

    historyBoard1 = []
    historyBoard2 = []

    fetchBoard(board1)
    fetchBoard(board2)

    fetchBoard(historyBoard1)
    fetchBoard(historyBoard2)

    for i in range(2):
        board = board1 if i == 0 else board2
        print(f"{boldText}JOGADOR {i + 1}, DIGITE AS COORDENADAS DOS SEUS NAVIOS.{normalText}")
        for j in range(5):
            while True:
                print(f"Digite a localização do navio {j + 1}:")
                coordinates = input().split()
                if len(coordinates) == 2:
                    x = int(coordinates[0])
                    y = int(coordinates[1])
                    if validateCoordinates(board, x, y, True):
                        break
                else:
                    print(f"{errorText}Formato incorreto. Tente novamente.{normalText}")
            board[x][y] = '@'
        printBoard(board)

    points = [0, 0]

    while True:
        for i in range(2):
            historyBoard = historyBoard1 if i == 0 else historyBoard2
            opponentBoard = board2 if i == 0 else board1
            while True:
                print(f"Jogador {i + 1}, digite a linha/coluna do tiro:")
                coordinates = input().split()
                if len(coordinates) == 2:
                    x = int(coordinates[0])
                    y = int(coordinates[1])
                    if validateCoordinates(historyBoard, x, y, False):
                        break
                else:
                    print(f"{errorText}Formato incorreto. Tente novamente.{normalText}")

            print(boldText)
            if shoot(historyBoard, opponentBoard, x, y):
                print(f"\nJOGADOR {i + 1} ACERTOU O NAVIO DO JOGADOR {2 if i == 0 else 1}!\n")
                points[i] += 1
            else:
                print(f"\nJOGADOR {i + 1} ERROU!\n")
            print(normalText)
            printBoard(historyBoard)

            if points[i] == 5:
                print(f"{successText}JOGADOR {1 if points[0] == 5 else 2} VENCEU! VOCÊ AFUNDOU TODOS OS NAVIOS DO SEU OPONENTE!{normalText}")
                print("Tabuleiros finais:")
                printBoard(board1)
                printBoard(board2)
                return

def fetchBoard(board):
    for i in range(5):
        row = ['-'] * 5
        board.append(row)

def validateCoordinates(board, x, y, isAddAction):
    size = len(board) - 1

    if x < 0 or x > size or y < 0 or y > size:
        print(f"{errorText}Coordenadas inválidas. Escolha coordenadas diferentes.{normalText}")
        return False
    elif board[x][y] == 'X' or board[x][y] == 'O':
        print(f"{errorText}Você já atirou nesta posição. Escolha diferente.{normalText}")
        return False
    elif board[x][y] == '@' and isAddAction:
        print(f"{errorText}Você já tem um navio aqui. Escolha coordenadas diferentes.{normalText}")
        return False    
    return True

def printBoard(board):
    print("\n \t0\t1\t2\t3\t4\n")
    for i in range(len(board)):
        row = '\t'.join(board[i])
        print(f"{i}\t{row}\n")

def shoot(historyBoard, opponentBoard, x, y):
    if opponentBoard[x][y] == '-':
        historyBoard[x][y] = 'O'
        opponentBoard[x][y] = 'O'
        return False
    elif opponentBoard[x][y] == '@':
        historyBoard[x][y] = 'X'
        opponentBoard[x][y] = 'X'
        return True

if __name__ == "__main__":
    main()
