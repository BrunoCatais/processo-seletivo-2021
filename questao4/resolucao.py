from difflib import SequenceMatcher

frase1 = input("Digite a primeira frase: ")
frase2 = input("Digite a primeira frase: ")

if len(frase1)>300:
    print("Comprimento da frase invalido")
    SystemExit

elif len(frase1)>300:
    print("Comprimento da frase invalido")
    SystemExit

else:
    score = round(SequenceMatcher(None, frase1, frase2).ratio(), 2)
    print("Nivel de similaridade: " + str(score))