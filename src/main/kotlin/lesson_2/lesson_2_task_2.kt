package lesson_2

fun main() {
    val employees = 50
    val oneEmployeeSalary = 30_000
    val interns = 30
    val oneInternSalary = 20_000

    val employeesSalary = employees * oneEmployeeSalary
    val totalSalary = interns * oneInternSalary + employeesSalary
    val averageSalary = totalSalary / (employees + interns)
    println("$employeesSalary\n$totalSalary\n$averageSalary")
}