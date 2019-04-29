package com.hdfc.loans.carloans;

public interface Rbi 
{
  void withdrawl();
  void deposit();
  
  public static void main(String[] args)
  {
   Rbi i1=new Icici();
   i1.deposit();
   i1.withdrawl();
   
   Rbi i2=new Hdfc();
   i2.deposit();
   i2.withdrawl();
  }
  }
