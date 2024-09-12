def criar_item(codigo, descricao, total):
    return {
        'codigo': codigo,
        'acrescimo': 0,
        'desconto': 0,
        'descricao': descricao,
        'total': total
    }


def adicionar_acrescimo(item, acrescimo):
    item['acrescimo'] += acrescimo


def adicionar_desconto(item, desconto):
    item['desconto'] += desconto
