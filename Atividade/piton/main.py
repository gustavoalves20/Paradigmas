from carrinho import *
from item import *

carrinho = criar_carrinho()


def main():
    continua = True

    print(
        "\n"
        "1 -> Inserir item ao carrinho\n"
        "2 -> Ácrescimo de item\n"
        "3 -> Desconto de item\n"
        "4 -> Ácrescimo total\n"
        "5 -> Desconto total\n"
        "6 -> Finalizar venda\n"
        "\n",
        end=''
    )

    opcao = input("Escolha sua opção: ")

    if opcao == "0":
        continua = False

    elif opcao == "1":
        codigo = int(input("Diga o código do produto: "))
        descricao = input("Diga a descrição do produto: ")
        total = float(input("Diga o valor do produto: "))
        adicionar_item(carrinho, criar_item(codigo, descricao, total))

    elif opcao == "2":
        codigo = int(input("Diga o código do produto: "))
        acrescimo = float(input("Diga o acréscimo de item: "))
        acrescimo_item(carrinho, codigo, acrescimo)

    elif opcao == "3":
        codigo = int(input("Diga o código do produto: "))
        desconto = float(input("Diga o desconto do produto: "))
        acrescimo_item(carrinho, codigo, desconto)

    elif opcao == "4":
        acrescimo = float(input("Diga o acréscimo do produto: "))
        acrescimo_total(carrinho, acrescimo)

    elif opcao == "5":
        desconto = float(input("Diga o desconto do produto: "))
        desconto_total(carrinho, desconto)

    elif opcao == "6":
        finalizar_comprar(carrinho)
        continua = False

    else:
        print("Opção inválida")

    if continua:
        main()


if __name__ == "__main__":
    main()
