# 🇧🇷 Convocação da Seleção Brasileira

Sistema de gerenciamento de convocações da Seleção Brasileira desenvolvido em Java, criado como projeto de portfólio para praticar conceitos de Programação Orientada a Objetos.

---

## 📋 Sobre o Projeto

O sistema simula o processo de convocação da Seleção Brasileira, permitindo cadastrar jogadores, definir um técnico e montar uma lista de convocados para uma competição.

---

## 🏗️ Estrutura do Projeto

```
src/
└── br/com/selecaobrasileira/
    ├── domain/
    │   ├── Jogador.java
    │   ├── Convocacao.java
    │   ├── Tecnico.java
    │   └── Posicao.java       (enum)
    └── application/
        └── Main.java
```

---

## 🧩 Domínio

### `Jogador`
Representa um atleta elegível para convocação.

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `dataNascimento` | `LocalDate` |
| `clube` | `String` |
| `numeroCamisa` | `int` |
| `posicao` | `Posicao` |
| `convocado` | `boolean` |

### `Tecnico`
Representa o treinador responsável pela convocação.

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `nacionalidade` | `String` |
| `dataInicioMandato` | `LocalDate` |

### `Convocacao`
Representa uma convocação oficial para uma competição.

| Atributo | Tipo |
|---|---|
| `competicao` | `String` |
| `dataConvocacao` | `LocalDate` |
| `tecnico` | `Tecnico` |
| `jogadores` | `ArrayList<Jogador>` |

### `Posicao` (enum)
```
GOLEIRO, ZAGUEIRO, LATERAL, VOLANTE, MEIA, ATACANTE
```

---

## ⚙️ Funcionalidades

- [x] Cadastrar jogadores com nome, data de nascimento, clube, número da camisa e posição
- [x] Cadastrar técnico com validação de substituição
- [ ] Criar convocação e selecionar jogadores da lista cadastrada
- [ ] Exibir convocação completa no console

---

## 🛠️ Tecnologias

- Java
- Orientação a Objetos (POO)
- `java.time` (LocalDate, Period)
- Collections (ArrayList)

---

## 📚 Conceitos Praticados

- Classes, atributos e métodos
- Encapsulamento (getters e setters)
- Enum
- Herança e composição de objetos
- Coleções (`ArrayList`)
- Manipulação de datas com `java.time`
- Separação de responsabilidades por packages

---

## 🔮 Próximos Passos

- Implementar criação de convocações e seleção de jogadores
- Validar número mínimo de goleiros (3) e limite de 26 convocados
- Exibir convocação formatada no console
- Integrar um banco de dados para persistência dos dados
- Refatorar para arquitetura com camadas `service` e `repository`

---

Desenvolvido por **Eduardo Bianchini Borges**
