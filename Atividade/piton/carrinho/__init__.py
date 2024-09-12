from item import adicionar_acrescimo, adicionar_desconto


def criar_carrinho():
    return {
        'itens': []
    }


def adicionar_item(carrinho, item):
    codigos = [item['codigo'] for item in carrinho['itens']]

    if item['codigo'] in codigos:
        print('Já tem um item com este código no carrinho')
    else:
        carrinho['itens'].append(item)



def buscar_item(carrinho, codigo):
    for item in carrinho['itens']:
        if item['codigo'] == codigo:
            return item

    else:
        return None


def acrescimo_item(carrinho, codigo, acrescimo):
    item = buscar_item(carrinho, codigo)

    if item is not None:
        adicionar_acrescimo(item, acrescimo)


def desconto_item(carrinho, codigo, desconto):
    item = buscar_item(carrinho, codigo)

    if item is not None:
        adicionar_desconto(item, desconto)


def acrescimo_total(carrinho, acrescimo):
    por_item = acrescimo / len(carrinho['itens'])

    for item in carrinho['itens']:
        adicionar_acrescimo(item, por_item)


def desconto_total(carrinho, desconto):
    por_item = desconto / len(carrinho['itens'])

    for item in carrinho['itens']:
        adicionar_acrescimo(item, por_item)


def finalizar_comprar(carrinho):
    acrescimo_compra = 0
    desconto_compra = 0
    total_compra = 0

    print('Lista de Itens')
    for item in carrinho['itens']:
        # {
        #     'codigo': codigo,
        #     'acrescimo': 0,
        #     'desconto': 0,
        #     'descricao': descricao,
        #     'total': total
        # }
        print(item)

        acrescimo_compra += item['acrescimo']
        desconto_compra += item['desconto']
        total_compra += item['total']

    print('\nTOTAL:')
    print(f'Acrescimo Total: {acrescimo_compra}')
    print(f'Desconto Total: {desconto_compra}')
    print(f'Valor Total: {total_compra + acrescimo_compra - desconto_compra}')
