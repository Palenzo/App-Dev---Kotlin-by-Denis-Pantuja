package blue.pink.bankaccountprogram

fun main(){
    val adityabankAccount = bankAccount("Aditya Pal",20000.00)
    adityabankAccount.deposit(200.00)
    adityabankAccount.displayTransactionhistory()
    adityabankAccount.withdraw(1939.00)
    adityabankAccount.deposit(382782.00)
    adityabankAccount.displayTransactionhistory()
    adityabankAccount.displayBalance()
}