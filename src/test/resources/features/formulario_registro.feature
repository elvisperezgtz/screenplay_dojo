Feature: Registro de nuevos usuarios
  Yo como Administrador del portal DEMO
  Necesito la creación de la cuenta de  nuevos usuarios.
  Para la fidelización de los clientes y que estos puedan hacer sus compras online

  Background: Inicio de sesion
    Given El se encuentra el la zona de registro de la pagina Advantage

  Scenario: Creacion exitosa de un usuario nuevo
    When El completa el registro con la informacion requerida por el formulario
      |username|email|password|
      |rocco|roccoco@gmail.com|Rocco124@|
    Then El deberia poder ver el mensaje de creacion exitosa del usuario