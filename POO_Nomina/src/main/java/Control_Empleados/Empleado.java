/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_Empleados;

/**
 *
 *
 */
public class Empleado {
    private String IdEmpleado;
    private String NombreEmpleado;
    private String ApellidoEmpleado;
    private String PuestoEmpleado;
    private Double Salario_Fijo;
    

   public Empleado(String IdEmpleado, String NombreEmpleado, String ApellidoEmpleado ,String PuestoEmpleado , Double Salario_Fijo ){
       this.NombreEmpleado = NombreEmpleado;
       this.IdEmpleado = IdEmpleado;
       this.ApellidoEmpleado = ApellidoEmpleado;
       this.Salario_Fijo = Salario_Fijo;
       this.PuestoEmpleado = PuestoEmpleado;
   }
    
    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }
   public String getApellidoEmpleado() {
        return ApellidoEmpleado;
    }

    public void setApellidoEmpleado(String ApellidoEmpleado) {
        this.ApellidoEmpleado = ApellidoEmpleado;
    }
       public String getPuestoEmpleado() {
        return PuestoEmpleado;
    }

    public void setPuestoEmpleado(String PuestoEmpleado) {
        this.PuestoEmpleado = PuestoEmpleado;
    }
       public Double getSalario_Fijo() {
        return Salario_Fijo;
    }

    public void setSalario_Fijo(Double Salario_Fijo) {
        this.Salario_Fijo = Salario_Fijo;
    }
    
    @Override//quitar el override
    public String toString() {//cambiar nombre tostring a otro nombre ya que es una clase
        return IdEmpleado+ "," +NombreEmpleado + "," + ApellidoEmpleado + "," + PuestoEmpleado + "," + Salario_Fijo;
    }

    public static Empleado fromString(String linea) {//cambiar nombre (es una clase)
       String[] partes = linea.split(",");
       return new Empleado(partes[0], partes[1], partes[2], partes[3], Double.parseDouble(partes[4]));
    }
    
    
}
