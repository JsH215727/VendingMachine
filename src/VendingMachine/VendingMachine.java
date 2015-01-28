/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package VendingMachine;
/**
 *
 * @author Jisheng
 */
import java.util.Scanner; 

	public class VendingMachine{
	
        static Scanner input = new Scanner(System.in);
	static int balance = 0, product, coins, bills, total=0, change=0, options;
	// For Testing 
		
		public static void payment(){
			////Start Payment Module////
		System.out.println("Please select the payment method:");
			
                do{
		//Enter money options
                    System.out.println("0. Money Entry Complete");
                    System.out.println("1. Enter Coins");
                    System.out.println("2. Enter Bills");
				
                    options = input.nextInt();
                    //choose a way to pay
                    if(options==0){
                        System.out.println("Total money is : " + total + " cents.\n");
                        break;
			}
			//The Vending Machine Accepts Coins
                    else if(options==1){
                        System.out.println("Enter coins");
				
                            do{
				System.out.println("Enter coins : 0,1,5,10,25");
                                coins =  input.nextInt();
				//Enter coins
					switch(coins){
							case 0:
                                                        break;
							case 1: //penny
                                                            total +=1;
                                                        break;
                                                            case 5: //nickel
							total +=5;
                                                            break;
							case 10: //dime
                                                            total +=10;
                                                            break;
                                                        case 25: //Quarter
                                                            total +=25;
                                                            break;
							default: 
                                                            System.out.println("Invalid Coins");
							break;
                                                    }
                            } while(coins!=0);
		}else if (options==2){
		//1 dollar bills, and 5 dollar bills
		do{
                                                                
                    System.out.println("Enter bills: 0,1,5");
                    bills = input.nextInt();
                    //Enter bills
                    switch(bills){
			case 0:
                            break;
                        case 1: // 1 dollar
                            total+=100;
                            break;
                        case 5:// 5 dollar
                            total +=500;
                            break;
                        default:
                            System.out.println("Invalid bills, please enter new bills\n");
				}
                        } while(bills!=0);
                    } else{
			System.out.println("Invalid Options\n");
                        }
                } while (options!=0);
		}
		
		public static void purchase(){
			//Start purchase module 
                        do{
			System.out.println("Please select your product :");
                        System.out.println("0. Nothing");
                        System.out.println("1. Coke - 34 Cents");
                        System.out.println("2. Chips - 45 Cents");
                        System.out.println("3. Gum - 55 Cents");
                        System.out.println("4. Pizza - 125 Cents");
                        System.out.println("5. Burger - 150 Cents");
                        
			//Select the product 
			product= input.nextInt();
                        //choose product
			switch(product){
			case 0:
				balance +=0;
				break;
			case 1:
				balance +=34;
				break;
			case 2:
				balance +=45;
				break;
			case 3:
				balance +=55;
				break;
			case 4:
				balance +=125;
				break;
			case 5:
				balance +=150;
				break;
			default:
				System.out.println("Invalid Products\n");
			}
                        }while(product != 0);
		}
		public static String calCoins (){
			//String changeString="";
			//int quaters, remQuater;
			int change = total - balance;
                        //change = total money - what you have spent
                        if (change < 0){
                            System.out.println("money is not enough. GGWP!");
                        }
                        
                        else{
                        int quarters = change / 25;//change quarters
                        change %= 25;
                        int dime = change / 10;//change dimes
                        change %= 10;
                        int nickel = change / 5;//change nickel
                        change %= 5;
                        int penny = change;//change penny
                        
                        System.out.println("Your change is " + change + " :");
                        System.out.println(quarters + " quarters.");
                        System.out.println(dime + " dimes.");
                        System.out.println(nickel + " nickels.");
                        System.out.println(penny + " pennies.");
                        }     
		    return null;
                }
        }