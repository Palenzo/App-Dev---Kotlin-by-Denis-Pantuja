package blue.pink.bankaccountprogram

class bankAccount (var accountHolder: String,var balance: Double){
    private val transactionHistory = mutableListOf<String>()
    fun deposit(amount: Double){
        balance+=amount
        transactionHistory.add("$accountHolder deposited $$amount and updated balance is $balance")
    }
    fun withdraw(amount: Double){
        if (amount<=balance){
            balance -=amount
            transactionHistory.add("$accountHolder withdrew $$amount and and updated balance is $balance")
        }else {
            println("You don't have enough funds")
        }
    }
    fun displayBalance(){
        println("Your current balance is $balance")
    }
    fun displayTransactionhistory(){
        println("Transaction History for $accountHolder")
        for(transaction in transactionHistory){
            println(transaction)
        }
    }
}