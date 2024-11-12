#Clase base
class Empleado:
    def __init__(self, nombre, id, salarioBase):
        self._nombre = nombre
        self._id = id
        self._salarioBase = salarioBase

    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def id(self):
        return self._id
    
    @id.setter
    def id(self, id):
        self._id = id

    @property
    def salarioBase(self):
        return self._salarioBase
    
    @salarioBase.setter
    def salarioBase(self, salarioBase):
        self._salarioBase = salarioBase

    def calcular_salario(self):
        return self._salarioBase
    
#Clase derivada de Empleado
class EmpleadoTiempoCompleto(Empleado):
    def calcular_salario(self):
        return self.salarioBase * 1.10
    
#Clase derivada de Empleado
class EmpleadoMedioTempo(Empleado):
    def calcular_salario(self):
        return self.salarioBase * 0.50
    
#Clase derivada de Empleado
class EmpleadoPorHoras(Empleado):
    TARIFA_POR_HORA = 15.0
    
    def __init__(self, nombre, id, salarioBase=0):
        super().__init__(nombre, id, salarioBase)
        self.horasTrabajadas = 0

    def set_horasTrabajadas(self, horas):
        self.horasTrabajadas = horas

    def calcular_salario(self):
        return self.horasTrabajadas * self.TARIFA_POR_HORA
    
#Programa principal
if __name__ == "__main__":
    nombre = input("Ingresa el nombre del empleado de tiempo completo: ")
    id = input("Ingresa su id: ")
    salario = float(input("Ingresa su salario base: "))
    empleado1 = EmpleadoTiempoCompleto(nombre, id, salario)

    nombre = input("Ingresa el nombre del empleado de medio tiempo: ")
    id = input("Ingresa su id: ")
    salario = float(input("Ingresa su salario base: "))
    empleado2 = EmpleadoMedioTempo(nombre, id, salario)

    nombre = input("Ingresa el nombre del empleado por horas: ")
    id = input("Ingresa su id: ")
    horas = int(input("Ingresa sus horas trabajadas: "))
    empleado3 = EmpleadoPorHoras(nombre, id, 0)
    empleado3.set_horasTrabajadas(horas)

    print(f"\nSalario de {empleado1.nombre}: ${empleado1.calcular_salario():.2f}")
    print(f"Salario de {empleado2.nombre}: ${empleado2.calcular_salario():.2f}")
    print(f"Salario de {empleado3.nombre}: ${empleado3.calcular_salario():.2f}")