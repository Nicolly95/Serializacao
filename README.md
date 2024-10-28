Este código serializa a compra de um cliente, armazena os seus dados sensíveis em um arquivo de forma segura
usando o modificador transiente. Ou seja, no momento da leitura do arquivo o seu nome ficará null.
Para este programa, utilizo das classes "Serializa2" e "ProductOnline" que implementa a interface Serializable.
Também utilizo classes importadas para fazer a gravação e a leitura do arquivo em bytes, e faço o 
tratamento de exceção dos erros disparados das mesmas.
E por fim, faço uso de um .gitignore para que o arquivo contendo as informações sensíveis do cliente 
não suba para este repositório.
