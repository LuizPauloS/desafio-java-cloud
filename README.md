<h1>Desafio Java Cloud</h1>

O desafio consiste em desenvolver uma API em Java utilizando REST onde consigamos
cadastrar/editar/deletar/recuperar (CRUD) um oumais veículos e seus tipos. A API deve possuir
os tratamentos adequados para os erros que podem acontecer nas chamadas. Os dados devem
ser gravados em um RDS da AWS e a aplicação deve rodar emuma instância EC2 da AWS (utilizar
as versões gratuitas).

<h3>Tecnologias:</h3>
<ul>
    <li>Java 8</li>
    <li>Spring Boot</li>
    <li>Maven</li>
    <li>MySql</li>
</ul>

<h3>Modelagem:</h3>

![modelagem](https://user-images.githubusercontent.com/15934133/74362858-2fcc8b00-4da8-11ea-9928-a17b19bab556.PNG)

<h3>Gerando o Pacote:</h3>

Sendo um projeto Maven, execute os goals clean e install na raiz do projeto para baixar 
as dependências e gerar jar do projeto.

```
#!/java-cloud
$ mvn clean install
```
     
Agora podemos executar o jar que foi gerado na pasta target e a aplicação irá subir em um
tomcat embedded.

```
#!/java-cloud/target
$ java -jar java-cloud-0.0.1-SNAPSHOT.jar
```  
<h3>Banco de Dados:</h3>
