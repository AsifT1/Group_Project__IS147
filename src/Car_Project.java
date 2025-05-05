import java.util.Scanner;
import java.util.Random;

public class Car_Project {

    public static void main(String[] args) {


        
        Scanner carModel = new Scanner(System.in);

        // Store's customer input for the rest of the code 
        Car customerCar = new Car();

        
        System.out.println("Welcome customer! Would you like to search for a specific model of vehicle today? (Yes/No): ");
        
        // Read's customer's response
        String response = carModel.nextLine();
        
        // equalsIgnoreCase is to process the input whether it's upper or lowercase 
        if(response.equalsIgnoreCase("Yes")) {
            System.out.println("Please enter the model of the car you prefer! ");
            String model = carModel.nextLine(); 
            customerCar.setCarModel(model);  // Set the car model using setter method
            System.out.println("You prefer a " + customerCar.getCarModel() + " model.");
        } else {
            System.out.println("That's okay, there's a ton of other models to search for :)");
        }

        //Nearby searching for car models 
        System.out.println("\nWould you like to search for cars nearby your area? (Yes/No): ");
        String nearbyResponse = carModel.nextLine();
        

        //Location detection
        if(nearbyResponse.equalsIgnoreCase("Yes")) {
            System.out.println("Great! Please enter your current or nearby city. ");
            String location = carModel.nextLine();  
            customerCar.setLocation(location);  

            // printing finding nearby cars
            System.out.println("Searching for cars near " + customerCar.getLocation() + ".....");
            
            // Display nearby cars using the location 
            displayNearbyCars(customerCar.getLocation());
        } else {
            System.out.println(" That's alright! You can still browse cars from other locations and listings.");
        }

        carModel.close();
    }

    // displays nearby cars
    public static void displayNearbyCars(String location) {
      
        System.out.println("\nHere's some cars available near your provided area" + location + ":");

        Scanner model = new Scanner(System.in);
        Random rand = new Random();
        List list1 = new List("Honda Civic");
        List list2 = new List("Toyota Corolla");
        List list3 = new List("Ford Mustang");
        List list4 = new List("Tesla Model 3");

        List.displayList();

       // Car listing w/ prices 
        System.out.println("1. 2021 Honda Civic - $22,000");
        System.out.println("2. 2019 Toyota Corolla - $18,500");
        System.out.println("3. 2020 Ford Mustang - $27,000");
        System.out.println("4. 2021 Tesla Model 3 - $40,000");
        System.out.println("5. Randomly choose one!");
        System.out.println("\n Which model are you interested in? ");



        String modelresponse = model.next();

        Make make = new Make();
        Condition conditionthree = new Condition("brand ", "new ");
        switch(modelresponse){
            case "6":
                System.out.printf("Sorry! That`s not a valid option! Goodbye!");
                break;
            case "7":
                System.out.printf("Sorry! That`s not a valid option! Goodbye!");
                break;
            case "8":
                System.out.printf("Sorry! That`s not a valid option! Goodbye!");
                break;
            case "9":
                System.out.printf("Sorry! That`s not a valid option! Goodbye!");
                break;
            case "10":
                System.out.printf("Sorry! That`s not a valid option! Goodbye!");
                break;
        }
        if(modelresponse.equalsIgnoreCase("5")){
            int randomNum = rand.nextInt(4) + 1;
            modelresponse = String.valueOf(randomNum);
            System.out.println("You`ve been given: " + modelresponse);
        }
        if(modelresponse.equalsIgnoreCase("1")){

            Scanner pay = new Scanner(System.in);

            System.out.println("How would you like to pay? ");
            System.out.println("1. Cash");
            System.out.println("2. Finance");
            System.out.println("3. Leasing ");
            String paymethod = pay.next();
            if(paymethod.equalsIgnoreCase("1")){
                CashPayment cashpayment = new CashPayment(0);
                cashpayment.setMoney(22000);
                CashSent cashsent = new CashSent();

                cashsent.processed();
                System.out.println("Congratulations!! You just bought this " + make.type + " for $"+cashpayment.getMoney());
            }
            if(paymethod.equalsIgnoreCase("2")){
                Scanner loan = new Scanner(System.in);

                System.out.println("Would you like to put a down payment? ");



                String CarLoan = loan.next();
                if(CarLoan.equalsIgnoreCase("No")){
                    System.out.println("Sorry! We only accept a minimum downpayment of $1000!");
                    System.exit(0);
                }
                if(CarLoan.equalsIgnoreCase("Yes")){
                    Scanner credit = new Scanner(System.in);

                    System.out.println("Alright! What is your credit score? ");
                    int creditresponse = credit.nextInt();

                    if (creditresponse >= 500)
                        System.out.println("Alright! You`ve been approved!");
                        else {
                            System.out.println("Bro.... get out of here");
                            System.exit(0);
                            }





                    Scanner down = new Scanner(System.in);
                    Downpayments downpayments = new Downpayments();
                    System.out.println(downpayments.toString());
                    double deposit = down.nextDouble();
                    CashPayment cashpayment = new CashPayment(0);
                    cashpayment.setMoney(22000);;
                    if (deposit >= 1000)
                    System.out.println("You now owe: " + (cashpayment.getMoney() - deposit ));


                    else {
                        System.out.println("Yeah get out of my shop");
                        System.exit(0);
                    }
                    Scanner rate = new Scanner(System.in);

                    System.out.println("\nHow many months are you trying to pay for? ");

                    System.out.println("1. 12 months");
                    System.out.println("2. 24 months");
                    System.out.println("3. 36 months");
                    System.out.println("4. 48 months");
                    String rately = rate.next();
                    if (rately.equalsIgnoreCase("1")){
                        System.out.println("Your monthly payment will be " + "$"+Math.round((cashpayment.getMoney() - deposit)/12) );
                    }
                    if (rately.equalsIgnoreCase("2")){
                        System.out.println("Your monthly payment will be " + "$"+Math.round((cashpayment.getMoney() - deposit)/24) );
                    }

                    if (rately.equalsIgnoreCase("3")){
                        System.out.println("Your monthly payment will be " + "$"+Math.round((cashpayment.getMoney() - deposit)/36) );
                    }

                    if (rately.equalsIgnoreCase("4")){
                        System.out.println("Your monthly payment will be " + "$"+Math.round((cashpayment.getMoney() - deposit)/48) );

                    }








                }


                }
            if(paymethod.equalsIgnoreCase("3")){
                ArrayList arraylist = new ArrayList();
                Scanner lease = new Scanner(System.in);

                String[] stringArray = {"1. Two years", "2. Three years", "3. Four years", "4. Five Years"};


                arraylist.printMyArray(stringArray);
                System.out.println("How many years would you like to lease the car for?");
                String leasing = lease.next();
                CashPayment cashpayment = new CashPayment(0);
                cashpayment.setMoney(22000);
                if(leasing.equalsIgnoreCase("1")){
                    System.out.println("Your monthly payment is $"+ Math.round((cashpayment.getMoney()-5000)/24) + "for 2 years!");

                }
                if (leasing.equalsIgnoreCase("2")){
                    System.out.println("Your monthly payment is $" + Math.round((cashpayment.getMoney()-7000)/36) + " for 3 years!" );
                }
                if (leasing.equalsIgnoreCase("3")){
                    System.out.println("Your monthly payment is $" +Math.round((cashpayment.getMoney() - 9000)/48) + " for 4 years!" );
                }
                if (leasing.equalsIgnoreCase("4")) {
                    System.out.println("Your monthly payment is $" + Math.round((cashpayment.getMoney() - 11000)/60) + " for 5 years!");
                }

            }
            System.out.println("Congratulations on your " +(conditionthree.type) + (conditionthree.speed) + make.type+"!");


        }
        if(modelresponse.equalsIgnoreCase("2")){
            Scanner methods = new Scanner(System.in);
            System.out.println("How would you like to pay? ");
            System.out.println("1. Cash");
            System.out.println("2. Finance");
            System.out.println("3. Leasing ");
            String corolla = methods.next();

            if(corolla.equalsIgnoreCase("1")) {
                CashPayment cashpayment = new CashPayment(0);
                cashpayment.setMoney(18500);
                CashSent cashsent = new CashSent();

                cashsent.processed();
                System.out.println("Congratulations!! You just bought this " + make.type2 + " for $" + cashpayment.getMoney());
            }
            if(corolla.equalsIgnoreCase("2")){
                System.out.println("Would you like to put a down payment? ");
                Scanner loantwo = new Scanner(System.in);
                String Cor = loantwo.next();
                if (Cor.equalsIgnoreCase("No")){
                    System.out.println("Sorry! We only accept those with a down payment of atleast $1000!");
                }
                if (Cor.equalsIgnoreCase("Yes")){
                    Scanner cred = new Scanner(System.in);

                    System.out.println("Alright! What is your credit score?");
                    int creditcard = cred.nextInt();

                    if (creditcard >= 500)
                    System.out.println("Alright! You`ve been approved!");
                    else {
                        System.out.println("Get out of my shop");
                        System.exit(0);
                    }

                    Scanner payment = new Scanner(System.in);
                    Downpayments downpayments = new Downpayments();
                    System.out.println(downpayments.toString());
                    double deposittwo = payment.nextDouble();
                    CashPayment cashpayment = new CashPayment(0);
                    cashpayment.setMoney(18500);

                    if (deposittwo >= 1000)
                        System.out.println("You now owe: " + (cashpayment.getMoney() - deposittwo));

                    else{
                        System.out.println("Sorry, we have a minimum down payment requirement of $1000");
                        System.exit(0);
                    }
                    Scanner rates = new Scanner(System.in);

                    System.out.println("/nHow many months are you trying to pay for? ");

                    System.out.println("1. 12 months");
                    System.out.println("2. 24 months");
                    System.out.println("3. 36 months");
                    System.out.println("4. 48 months");
                    String month = rates.next();
                    if (month.equalsIgnoreCase("1")){
                        System.out.println("Your monthly payment will be " + "$"+Math.round((cashpayment.getMoney() - deposittwo)/12) );
                    }
                    if (month.equalsIgnoreCase("2")){
                        System.out.println("Your monthly payment will be " + "$"+Math.round((cashpayment.getMoney() - deposittwo)/24) );
                    }
                    if (month.equalsIgnoreCase("3")){
                        System.out.println("Your monthly payment will be " + "$"+Math.round((cashpayment.getMoney() - deposittwo)/36) );
                    }
                    if (month.equalsIgnoreCase("4")){
                        System.out.println("Your monthly payment will be " + "$"+Math.round((cashpayment.getMoney() - deposittwo)/48) );
                    }

                }



                }
            if(corolla.equalsIgnoreCase("3")){
                ArrayList arraylist = new ArrayList();
                Scanner monthlease = new Scanner(System.in);
                String[] stringArray = {"1. Two years", "2. Three years", "3. Four years", "4. Five Years"};

                arraylist.printMyArray(stringArray);
                System.out.println("How many years would you like to lease the car for? ");
                String leases = monthlease.next();
                CashPayment cashpayment = new CashPayment(0);
                cashpayment.setMoney(18500);
                if (leases.equalsIgnoreCase("1")){
                    System.out.println("Your monthly payment is $"+Math.round((cashpayment.getMoney()-5000)/24)+ " for 2 years!");
                }
                if (leases.equalsIgnoreCase("2")){
                    System.out.println("Your monthly payment is $"+Math.round((cashpayment.getMoney()-7000)/36)+ " for 3 years!");
                }
                if (leases.equalsIgnoreCase("3")){
                    System.out.println("Your monthly payment is $"+Math.round((cashpayment.getMoney()-9000)/48)+ " for 3 years!");
                }
                if (leases.equalsIgnoreCase("4")){
                    System.out.println("Your monthly payment is $"+Math.round((cashpayment.getMoney()-11000)/60)+ " for 5 years!");
                }
                System.out.println("Congratulations on your " + (conditionthree.type) + (conditionthree.speed) + make.type2+"!");
            }

        }

        if (modelresponse.equalsIgnoreCase("3")){

            Scanner options = new Scanner(System.in);
            System.out.println("How would you like to pay? ");
            System.out.println("1. Cash");
            System.out.println("2. Finance");
            System.out.println("3. Leasing ");

            String opts = options.next();
            if(opts.equalsIgnoreCase("1")){
                CashPayment cashpayment = new CashPayment(0);
                cashpayment.setMoney(27000);
                CashSent cashsent = new CashSent();
                cashsent.processed();
                System.out.println("Congratulations!! You just bought this " + make.type3 + " for $"+cashpayment.getMoney());
            }
            if(opts.equalsIgnoreCase("2")){
                System.out.println("Would you like to put a down payment? ");
                Scanner loanthree = new Scanner(System.in);
                String Ford = loanthree.next();
                if(Ford.equalsIgnoreCase("No")){
                    System.out.println("Sorry! We only accept those who put a down payment of atleast $1000");
                    System.exit(0);
                }
                if(Ford.equalsIgnoreCase("Yes")){
                    Scanner score = new Scanner(System.in);
                    System.out.println("Alright! What is your credit score? ");
                    int creditnum = score.nextInt();
                    if (creditnum >= 500)
                    System.out.println("Alright! You`re approved!");
                    else {
                        System.out.println("Please leave...");
                        System.exit(0);
                    }
                Scanner monthpay = new Scanner(System.in);
                    Downpayments downpayments = new Downpayments();
                    System.out.println(downpayments.toString());
                    double depositthree = monthpay.nextDouble();
                    CashPayment cashpayment = new CashPayment(0);
                    cashpayment.setMoney(27000);

                    if (depositthree >= 1000)
                        System.out.println("You now owe: " + (cashpayment.getMoney() - depositthree));
                    else{
                        System.out.println("Sorry, we have a minimum down payment requirement of $1000");
                        System.exit(0);
                    }
                    Scanner ratez = new Scanner(System.in);
                    System.out.println("How many months are you trying to pay for? ");
                    System.out.println("1. 12 months");
                    System.out.println("2. 24 months");
                    System.out.println("3. 36 months");
                    System.out.println("4. 48 months");
                    String mo = ratez.next();
                    if (mo.equalsIgnoreCase("1")) {
                        System.out.println("Your monthly payment will be " + "$" + Math.round((cashpayment.getMoney() - depositthree) / 12));
                    }
                    if (mo.equalsIgnoreCase("2")) {
                        System.out.println("Your monthly payment will be " + "$" + Math.round((cashpayment.getMoney() - depositthree) / 24));
                    }
                    if (mo.equalsIgnoreCase("3")) {
                        System.out.println("Your monthly payment will be " + "$" + Math.round((cashpayment.getMoney() - depositthree) / 36));
                    }
                    if (mo.equalsIgnoreCase("4")) {
                        System.out.println("Your monthly payment will be " + "$" + Math.round((cashpayment.getMoney() - depositthree) / 48));
                    }


                    }



            }
            if(opts.equalsIgnoreCase("3")) {
                ArrayList arraylist = new ArrayList();
                Scanner monthlease = new Scanner(System.in);

                String[] stringArray = {"1. Two years", "2. Three years", "3. Four years", "4. Five Years"};
                arraylist.printMyArray(stringArray);
                System.out.println("How many years would you like to lease the car for?");
                String leasings = monthlease.next();
                CashPayment cashpayment = new CashPayment(0);
                cashpayment.setMoney(27000);
                if (leasings.equalsIgnoreCase("1")) {
                    System.out.printf("Your monthly payment is $" + Math.round((cashpayment.getMoney() - 5000) / 24) + "for 2 years!");

                }

                if (leasings.equalsIgnoreCase("2")) {
                    System.out.printf("Your monthly payment is $" + Math.round((cashpayment.getMoney() - 7000) / 36) + " for 3 years!");
                }
                if (leasings.equalsIgnoreCase("3")) {
                    System.out.printf("Your monthly payment is $" + Math.round((cashpayment.getMoney() - 9000) / 48) + " for 4 years!");
                }
                if (leasings.equalsIgnoreCase("4")) {
                    System.out.printf("Your monthly payment is $" + Math.round((cashpayment.getMoney() - 11000) / 60) + " for 5 years!");
                }



            }
            System.out.println("Congratulations on your " + (conditionthree.type) + (conditionthree.speed) + make.type3+"!");
        }
        if (modelresponse.equalsIgnoreCase("4")){
            Scanner paying = new Scanner(System.in);

            System.out.println("How would you like to pay? ");
            System.out.println("1. Cash");
            System.out.println("2. Finance");
            System.out.println("3. Leasing ");
            String paymenttype = paying.next();
            if(paymenttype.equalsIgnoreCase("1")) {
                CashPayment cashpayment = new CashPayment(0);
                cashpayment.setMoney(40000);
                CashSent cashsent = new CashSent();
                cashsent.processed();
                System.out.println("Congratulations!! You just bought this " + make.type4 + "for $" + cashpayment.getMoney());
            }
            if(paymenttype.equalsIgnoreCase("2")){
              System.out.println("Would you like to put a down payment? ");
              Scanner loanfour = new Scanner(System.in);
              String Tesla = loanfour.next();
              if (Tesla.equalsIgnoreCase("No")){
                  System.out.println("Sorry! We only accept those who atleast put a down payment of $1000!");
                  System.exit(0);
              }
              if (Tesla.equalsIgnoreCase("Yes")){
                  Scanner creditpay = new Scanner(System.in);
                  System.out.println("Alright! What is your credit score!");
                  int creditcardmonth = creditpay.nextInt();

                  if (creditcardmonth >= 500)
                      System.out.println("Alright! You`ve been approved!");
                  else{
                      System.out.println("Dude get out of here..");
                      System.exit(0);
                  }
                 Scanner loans = new Scanner(System.in);
                  Downpayments downpayments = new Downpayments();
                  System.out.println(downpayments.toString());
                  double lastdeposit = loans.nextDouble();
                  CashPayment cashPayment= new CashPayment(0);
                  cashPayment.setMoney(40000);

                  if (lastdeposit >= 1000)
                  System.out.println("You now owe: " + (cashPayment.getMoney()-lastdeposit));

                  else {
                      System.out.println("Sorry, we have a minimum downpayment of $1000!");
                      System.exit(0);
                  }
                  Scanner methods = new Scanner(System.in);
                  System.out.println("How many months are you trying to pay for? ");
                  System.out.println("1. 12 months");
                  System.out.println("2. 24 months");
                  System.out.println("3. 36 months");
                  System.out.println("4. 48 months");
                  String times = methods.next();
                  if (times.equalsIgnoreCase("1")){
                      System.out.println("Your monthly payment will be $" + Math.round((cashPayment.getMoney()-lastdeposit)/12));
                  }
                  if (times.equalsIgnoreCase("2")){
                      System.out.println("Your monthly payment will be $" + Math.round((cashPayment.getMoney()-lastdeposit)/24));
                  }
                  if (times.equalsIgnoreCase("3")){
                      System.out.println("Your monthly payment will be $" + Math.round((cashPayment.getMoney()-lastdeposit)/36));
                  }
                  if (times.equalsIgnoreCase("4")){
                      System.out.println("Your monthly payment will be $" + Math.round((cashPayment.getMoney()-lastdeposit)/48));
                  }

              }
            }
            if (paymenttype.equalsIgnoreCase("3")){
                ArrayList arraylist = new ArrayList();
                Scanner leasetype = new Scanner(System.in);
                String[] stringArray = {"1. Two years", "2. Three years", "3. Four years", "4. Five Years"};
                arraylist.printMyArray(stringArray);
                System.out.println("How many years would you like to lease the car for?");
                String leases =  leasetype.next();
                CashPayment cashPayment = new CashPayment(0);
                cashPayment.setMoney(40000);
                if(leases.equalsIgnoreCase("1")){
                  System.out.println("Your monthly payment is $" + Math.round((cashPayment.getMoney()-5000)/24));
                }
                if(leases.equalsIgnoreCase("2")){
                    System.out.println("Your monthly payment is $" + Math.round((cashPayment.getMoney()-7000)/36));
                }
                if(leases.equalsIgnoreCase("3")){
                    System.out.println("Your monthly payment is $" + Math.round((cashPayment.getMoney()-9000)/48));
                }
                if(leases.equalsIgnoreCase("4")){
                    System.out.println("Your monthly payment is $" + Math.round((cashPayment.getMoney()-11000)/60));
                }
            }
            System.out.println("Congratulations on your " + (conditionthree.type) + (conditionthree.speed) + make.type4+"!");
        }
        AbstractTwo abstracttwo = new AbstractTwo();

        abstracttwo.load();

    }
}


class Car {


    private String carModel;
    private String location;

    // Getter for carModel
    public String getCarModel() {
        return carModel;
    }

    // Setter for carModel
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }

}