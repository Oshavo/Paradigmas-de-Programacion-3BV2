# Excepcion para depositos invalidos
class DepositoInvalidoException(Exception):
    def __init__(self, mensaje="El monto a depositar no puede ser negativo."):
        super().__init__(mensaje)

# Excepcion para retiros invalidos
class RetiroInvalidoException(Exception):
    def __init__(self, mensaje="El monto a retiro no puede ser negativo."):
        super().__init__(mensaje)

# Excepcion para fondos insuficientes
class FondosInsuficientesException(Exception):
    def __init__(self, mensaje="Fondos insuficientes para realizar el retiro."):
        super().__init__(mensaje)

# Clase cuenta bancaria
class cuentaBancaria:
    def __init__(self, numeroCuenta, saldo):
        self.numeroCuenta = numeroCuenta
        self.saldo = saldo

    def depositar(self, cantidad):
        if cantidad<0:
            raise DepositoInvalidoException()
        self.saldo += cantidad

    def retirar(self, cantidad):
        if cantidad<0:
            raise RetiroInvalidoException()
        if cantidad>self.saldo:
            raise FondosInsuficientesException()
        self.saldo -= cantidad

    def getSaldo(self):
        return self.saldo
    
    def getCuenta(self):
        return self.numeroCuenta
    
# Programa principal
def main():
    num = input("Ingresa el numero de cuenta: ")
    saldo = float(input("Ingresa el saldo inicial: "))
    cuenta = cuentaBancaria(num, saldo)

    while True:
        print("\n--- Menu ---")
        print("1. Depositar dinero")
        print("2. Retirar dinero")
        print("3. Consultar saldo")
        print("4. Salir")

        try:
            opc = int(input("Seleccione una opcion: "))
            if opc == 1:
                cantidad = float(input("Ingrese la cantidad a depositar: "))
                cuenta.depositar(cantidad)
                print(f"Deposito exitoso. Saldo actual: ${cuenta.getSaldo():.2f}")
            elif opc == 2:
                cantidad = float(input("Ingrese la cantidad a retirar: "))
                cuenta.retirar(cantidad)
                print(f"Retirar exitoso. Saldo actual: ${cuenta.getSaldo():.2f}")
            elif opc == 3:
                print(f"Saldo actual: ${cuenta.getSaldo():.2f}")
            elif opc == 4:
                print("Hasta luego.")
                break
            else:
                print("Opcion no valida. Intente de nuevo.")
        except ValueError:
            print("Error: Por favor, ingrese un numero valido.")
        except DepositoInvalidoException as e:
            print(f"Error: {e}")
        except RetiroInvalidoException as e:
            print(f"Error: {e}")
        except FondosInsuficientesException as e: 
            print(f"Error: {e}")

if __name__ == "__main__":
    main()
