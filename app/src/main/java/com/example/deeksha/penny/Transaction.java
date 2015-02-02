package com.example.deeksha.penny;

//public class Transaction {
//
//    private static int[] dateIcon ={
//            R.drawable.thirtyone,
//            R.drawable.one
//                };
//    private static String[] transactionName = {
//            "Taxes",
//            "Tuition Fees"
//    };
//    private static double[] transactionPrice= {
//            56.89,4500
//    };
//    private static int[] categoryIcon = {
//            R.drawable.Business,
//            R.drawable.Education
//    };
//
//
//}

public class Transaction {

    private String name;
    private String amount;

    public Transaction(String name, String amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
