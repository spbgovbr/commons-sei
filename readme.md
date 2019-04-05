# ANS Commons SEI

ANS Commons SEI é uma bibliotecaque tem objetivo que prover os objetos utilizados pelos serviços do **SEI-Broker**.
<br />Esta versão conta com classes de representação de modelo e a classe utilitária SeiHelper.

## Recursos

### SeiHelper
- A classe utilitária SeiHelper provê métodos para transformação de String e byte[] em Base64 e geração de hash SHA-256.

```java
// O método calcularHash recebe uma string, calcula e retorna o hash SHA-256 correspondente.
String sha256 = SeiHelper.calcularHash(string);

// O método getBase64(byte[] bytes) recebe um array de bytes, faz a transformação e retorna o conteúdo Base64 correspondente.
String base64 = SeiHelper.getBase64(bytes);

// O método getBase64(File arquivo) recebe um objeto File, faz a transformção e retorna o conteúdo Base64 correspondente.
String base64 = SeiHelper.getBase64(arquivo);
```



## Utilização

Com a **biblioteca disponibilizada em seu repositório**, a dependência pode ser referênciada no arquivo pom.xml do projeto como:

```xml
<dependency>
    <groupId>br.gov.ans.commons</groupId>
    <artifactId>ans-commons-sei</artifactId>
    <version>1.2.1</version>
</dependency>
```