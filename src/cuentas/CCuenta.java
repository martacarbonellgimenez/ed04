package cuentas;

/**
 *
 * cuentas.CCuenta - Esta clase guarda los distintos atributos de las cuentas corrientes
 * y contiene lar principales operaciones que se pueden hacer con los mismos:
 * estado, ingresar, retirar
 *
 * Incluye los siguientes atributos:
 * <ul>
 *   <li>nombre</li>
 *   <li>cuenta</li>
 *   <li>saldo</li>
 *   <li>tipoInterés</li>
 * </ul>
 *
 * @author marta
 * @version 1.0
 *
 *
 */
public class CCuenta {


  private String nombre;
  private String cuenta;
  private double saldo;
  private double tipoInterés;

  /**
   * Constructor por defecto
   */
  public CCuenta()
  {
  }

  /**
   * Constructor sobrecargado
   *
   * @param nom nombre
   * @param cue cuenta
   * @param sal saldo
   * @param tipo tipoInterés (no se asigna)
   */
  public CCuenta(String nom, String cue, double sal, double tipo)
  {
    nombre =nom;
    cuenta=cue;
    saldo=sal;
  }

  /**
   * getter nombre
   * @return nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * setter nombre
   * @param nombre
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * getter cuenta
   * @return cuenta
   */
  public String getCuenta() {
    return cuenta;
  }

  /**
   * setter cuenta
   * @param cuenta
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * getter saldo
   * @return saldo
   */
  public double getSaldo() {
    return saldo;
  }

  /**
   * setter saldo
   * @param saldo
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * getter tipoInterés
   * @return tipoInterés
   */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * setter tipoInterés
   * @param tipoInterés
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }

  /**
   *
   * Este método comprueba el saldo de la cuenta
   *
   * @return saldo actual de la cuenta
   */
  public double estado()
  {
    return saldo;
  }

  /**
   *
   * Este método recibe una cantidad que le pasamos al método por parámetro
   * y lo añade al valor guardado en saldo
   *
   * @param cantidad dinero que vamos a añadir al saldo
   * @throws Exception en caso de que se pase un número negativo
   */
  public void ingresar(double cantidad) throws Exception
  {
    if (cantidad<0)
      throw new Exception("No se puede ingresar una cantidad negativa");
    saldo = saldo + cantidad;
  }

  /**
   *
   * Este método recibe una cantidad que le pasamos al método por parámetro
   * y lo resta al valor guardado en saldo
   *
   * @param cantidad dinero que vamos a restar al saldo
   * @throws Exception si 1) intentamos retirar una cantidad negativa de dinero
   *    o si 2) la cantidad que pasamos es superior al valor gardado en saldo
   */
  public void retirar(double cantidad) throws Exception
  {
    if (cantidad <= 0)
      throw new Exception ("No se puede retirar una cantidad negativa");
    if (estado()< cantidad)
      throw new Exception ("No se hay suficiente saldo");
    saldo = saldo - cantidad;
  }
}