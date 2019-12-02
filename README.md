# Patterns utilizados:
Strategy, Proxy e Factory Method

# Exemplo:
Simular um app que toca música em diversos aparelhos.

# Strategy:
Nesse exemplo serve para que quando uma música esteja tocando em um aparelho e for tocar em outro, só mudar onde está tocando sem recriar o objeto.

# Proxy:
Serve para que quando a música estiver tocando no celular, ela toque no fone da mesma maneira, somente enviando um alerta para o usuário colocar o fone de ouvido.

# Factory Method:
Serve para diminuir o acoplamento da Classe Modo de Tocar e suas filhas com a classe cliente do nosso exemplo.
