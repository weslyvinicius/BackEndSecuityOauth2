# Squad MyProject - New Feature

[1] [[CDVCECPZE-X]](https://jiracorp.ctsp.prod.cloud.ihf/browse/CDVCECPZE-X)

## Description

Descrever aqui o que foi feito...

## DoD - Technical Definition of Done

- [ ] Sim! - Está respeitando a arquitetura hexagonal?

**Documentação**

- [ ] Sim! - Documentação foi atualizada? (Confluence e README.md)
- [ ] Sim! - Collection Postman atualizada refletindo contrato atual da implementação no diretório ./Postman?
- [ ] Sim! - Collection Postman atualizada refletindo contrato atual da implementação no repositório [Collections Postman](https://gitcorp.prod.cloud.ihf/EQ3/postman-collections-eq3/-/tree/master/)

**Testes**

- [ ] Sim! - 90%+ de cobetura no SonarQube para a implementação atual?
- [ ] Sim! - 70%+ de cobertura de testes mutantes
- [ ] Sim! - Testes unitários/integrados cobrem todos cenários possíveis no fluxo?
- [ ] Sim! - Alteração no mock está versionado e funcional?
  a
  **Avisos**

- [X] Ok! - A evolução da feature até o ambiente de development deve ser acompanhada por você.
- [X] Ok! - Ao entregar o código da branch na DEVELOP, gerar um branch de "release_candidate".
- [X] Ok! - O primeiro teste da feature no ambiente deve ser realizado por você, e:
* Em caso de falha, notificar a equipe que você já está atuando para sanar o problema.
* Em caso de sucesso, avançar a estória para "DEVELOPED" e notificar a equipe de qualidade informando que a estórias está ready for tests.
- [X] Ok! - Alterações em application.properties do projeto devem ser reproduzidas no PARAMETER STORE nos ambientes (dev, homol e prod).

## SonarQube

**New Code**

Anexar aqui o print do sonar com a porcentagem de cobertura para os novos códigos.

**Overall Code**

Anexar aqui o print do sonar com a porcentagem de cobertura total do projeto após a implementação.

## Pitest - Mutation Testing

**Pit Test Coverage Report**

Anexar aqui o print do sonar com a porcentagem de cobertura total do projeto após a implementação.

## Aceite MR e Code review

Antes de aprovar o MR, garantir que as recomendações foram seguidas e que os testes unitários e mutantes tem coberturas mínimas atendidas.

- [ ] Aprovador 1: [[Recomendações a seguir]](https://confluencecorp.ctsp.prod.cloud.ihf/display/SECPZ/CheckList+do+Code+Review)
- [ ] Aprovador 2: [[Recomendações a seguir]](https://confluencecorp.ctsp.prod.cloud.ihf/display/SECPZ/CheckList+do+Code+Review)