Feature: Purchase products at open cart

  @happyPath
  Scenario Outline: Proceso de compra
    #agresar al carrito
    Given User estoy en la pagina opencart
    When selecciono un producto del catalogo
    Then agrego al producto al carrito
    And veo el carrito

  #completar la compra
    When ingreso datos <Name> <Country> <City> <Credit card> <Month> <Year>
    Then veo nuevo formulario
    Examples:
      | Name | Country | City       | Credit card  | Month  | Year |
      | Jose | Ecuador | Esmeraldas | 055011011011 | Agosto | 2013 |