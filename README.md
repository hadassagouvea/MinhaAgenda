# Minha Agenda
Projeto de desenvolvimento de um app de agenda mobile para a disciplina de Engenharia de Aplicações Móveis (2024/2).


## 1. Apresentação do Projeto
O projeto consiste no desenvolvimento de um aplicativo mobile com Java para a implementação de uma agenda que permitirá o cadastro de compromissos, representados por data, hora e descrição. A interface do aplicativo deve ser elaborada com a seguinte estrutura:

![trla3minhaagenda](https://github.com/user-attachments/assets/99cf20af-61bc-4ebe-b659-2fd4ef070135)


## 2. Etapas do Projeto:
|        Etapa         |Implementação                        |Status                         |
|----------------|-------------------------------|------------------------|
|`Etapa 1`|Implementação das classes do modelo| Finalizado
|`Etapa 2`|Implementação da interface de usuário| Finalizado
|`Etapa 3`|Tratamento do botão "Ok" e saída de texto no segundo fragmento| Finalizado
|`Etapa 4`|Desenvolvimento das classes de apoio (_helper_) e de acesso a um banco de dados SQLite.| Em desenvolvimento

        
## 3. Desenvolvimento do Projeto

### Etapa 1:
Foi implementada apenas uma classe _Compromisso_ para o gerenciamento dos eventos cadastrados no sistema.

### Etapa 2: 
Foram implementados os dois fragmentos referentes a entrada e saída de dados (_FragmentoEntrada_ e _FragmentoVisualizacao_) e a MainActivity, conforme o enunciado da atividade. A interface de usuário desenvolvida foi elaborada da seguinte maneira:

![tela1minhaagenda](https://github.com/user-attachments/assets/14884e7e-927f-4248-95f8-4b4be42cb520)

![tela2minhaagenda](https://github.com/user-attachments/assets/67cd504c-70b1-45ca-9d89-02d3c6efa959)

### Etapa 3:
Foram implemetados as saídas de texto no Logcat, para o cadastro de novo compromisso (_FragmentoEntrada_), e na tela para a data selecionada pelo usuário (_FragmentoVisualizacao_).

![MinhaAgendaLogCatTela](https://github.com/user-attachments/assets/c75c7dcc-ddda-4e80-a223-ded4744e3daa)

![MinhaAgendaBotaoHoje](https://github.com/user-attachments/assets/923f4365-f667-476b-8cc7-7e6af363cdd7)

![MinhaAgendaBotaoOutraData](https://github.com/user-attachments/assets/33bc9333-db19-4620-90c6-ababf76ae415)
