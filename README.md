# DEVinHouse_Modulo_2-Projeto_Avaliativo-2

1 INTRODUÇÃO
A DEVinPharmacy LTDA, uma renomada empresa do ramo farmacêutico, está expandindo a sua rede de lojas. Por conta da expansão, o time de gestão necessita da criação de um sistema online, intitulado PharmacyManagement, para gerenciamento de medicamentos e farmácias. O seu perfil chamou a atenção dos gestores para a criação do back-end do sistema que deverá ser codificado em Java, utilizando o framework Spring Boot.

2 REQUISITOS DA APLICAÇÃO
A aplicação contempla os seguintes requisitos:
A aplicação foi codificada utilizando o framework Spring Boot juntamente com a linguagem de programação Java, e o banco de dados PostgreSQL;
Retorna todos os dados no formato JSON;

3 API
Foi utilizado a API da viacep para a função de completar automaticamente alguns campos de endereço.
Documentação viacep: https://viacep.com.br/  
Para o consumo dessa api foi implementado nas dependencias o Feign que é um web service
Documentação Feign: https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-openfeign

4 ENDPOINTS
/usuario
GET - lista todos usuários cadastrados

/farmacia
GET - lista todas farmacias cadastradas
/farmacia/id
GET - lista farmacia por ID

/medicamento
GET - lista todos medicamentos
/medicamento/id
GET - lista medicamento por id
