import java.util.Scanner;

public class BusTicket {
    public static void main(String[] args) {
        // Bus Ticket Project in java

        // Bus Ticket price and some extra element's
        String name;
        String gender;
        String student;
        String student_ticket;
        String should_to;
        String should_from;
        String ticket_type;
        int pay;

        // For user input
        Scanner input = new Scanner(System.in);

        // Ask from user is he/she student?
        System.out.print("Enter your name to buy a ticket: ");
        name = input.nextLine().toUpperCase();

        // For ensure the ticket holder is male or female
        System.out.print("Select your gender (M)ale or (F)emale: ");
        gender = input.nextLine();

        // For check male or female
        if (gender.toUpperCase().equals("M")) {
            System.out.printf("Hello MR.%s welcome to Java Ticket Service!\n", name.toUpperCase());
            // For check he/she is student or not
            System.out.printf("%s are you Student (Y)es or (N)o: ", name);
            student = input.nextLine();

            if (student.toUpperCase().equals("Y")) {
                System.out.printf("MR. %s, we have a student ticket so if you want to buy it then you can get 50%% off.\nDid you want 50%% off (Y)es or (N)o: ", name);
                student_ticket = input.nextLine();
                if (student_ticket.toUpperCase().equals("Y")) {
                    System.out.printf("MR. %s, where you should go: ", name);
                    should_to = input.nextLine().toUpperCase();
                    if (should_to.toUpperCase().equals("DHAKA")) {
                        System.out.printf("MR. %s, thank you. So now we have to know about your from place: ", name);
                        should_from = input.nextLine().toUpperCase();
                        if (should_from.toUpperCase().equals("SATKHIRA")) {
                            System.out.printf("MR. %s which ticket type you want (C)hair coach or (B)usiness class: ", name);
                            ticket_type = input.nextLine().toUpperCase();
                            if (ticket_type.toUpperCase().equals("C")) {
                                System.out.printf("MR. %s you chose Chair coach ticket the price is 400 BDT.\nPlease pay your ticket price: ", name);
                                pay = input.nextInt();
                                input.nextLine(); // fix newline bug
                                if (pay == 400) {
                                    System.out.printf("MR. %s your payment was successfully done.\nHave a safe and suitable journey from %s to %s \n", name, should_from, should_to);
                                } else {
                                    System.out.printf("MR. %s your payment was not successfully done!\n", name);
                                }
                            } else if (ticket_type.equals("B")) {
                                System.out.printf("MR. %s you chose Business class ticket the price is 800 BDT.\nPlease pay your ticket price: ", name);
                                pay = input.nextInt();
                                input.nextLine(); // fix newline bug
                                if (pay == 800) {
                                    System.out.printf("MR. %s your payment was successfully done.\nHave a safe and suitable journey from %s to %s \n", name, should_from, should_to);
                                } else {
                                    System.out.printf("MR. %s your payment was not successfully done!\n", name);
                                }
                            } else {
                                System.out.printf("MR. %s we have only Chair coach & Business class service!!!\n", name);
                            }
                        } else {
                            System.out.printf("MR. %s, we don't have %s route bus, sorry for that!\n", name, should_from);
                        }
                    } else {
                        System.out.printf("MR. %s, we don't have %s route bus, sorry for that!\n", name, should_to);
                    }
                } else {
                    System.out.printf("MR. %s, where you should go: ", name);
                    should_to = input.nextLine().toUpperCase();
                    if (should_to.equals("DHAKA")) {
                        System.out.printf("MR. %s, thank you. So now we have to know about your from place: ", name);
                        should_from = input.nextLine().toUpperCase();
                        if (should_from.equals("SATKHIRA")) {
                            System.out.printf("MR. %s which ticket type you want (C)hair coach or (B)usiness class: ", name);
                            ticket_type = input.nextLine().toUpperCase();
                            if (ticket_type.equals("C")) {
                                System.out.printf("MR. %s you chose Chair coach ticket the price is 800 BDT.\nPlease pay your ticket price: ", name);
                                pay = input.nextInt();
                                input.nextLine(); // fix newline bug
                                if (pay == 800) {
                                    System.out.printf("MR. %s your payment was successfully done.\nHave a safe and suitable journey from %s to %s \n", name, should_from, should_to);
                                } else {
                                    System.out.printf("MR. %s your payment was not successfully done!\n", name);
                                }
                            } else if (ticket_type.equals("B")) {
                                System.out.printf("MR. %s you chose Business class ticket the price is 1600 BDT.\nPlease pay your ticket price: ", name);
                                pay = input.nextInt();
                                input.nextLine(); // fix newline bug
                                if (pay == 1600) {
                                    System.out.printf("MR. %s your payment was successfully done.\nHave a safe and suitable journey from %s to %s \n", name, should_from, should_to);
                                } else {
                                    System.out.printf("MR. %s your payment was not successfully done!\n", name);
                                }
                            } else {
                                System.out.printf("MR. %s we have only Chair coach & Business class service!!!\n", name);
                            }
                        } else {
                            System.out.printf("MR. %s, we don't have %s route bus, sorry for that!\n", name, should_from);
                        }
                    } else {
                        System.out.printf("MR. %s, we don't have %s route bus, sorry for that!\n", name, should_to);
                    }
                }
            } else {
                System.out.printf("MR. %s, where you should go: ", name);
                should_to = input.nextLine().toUpperCase();
                if (should_to.equals("DHAKA")) {
                    System.out.printf("MR. %s, thank you. So now we have to know about your from place: ", name);
                    should_from = input.nextLine().toUpperCase();
                    if (should_from.equals("SATKHIRA")) {
                        System.out.printf("MR. %s which ticket type you want (C)hair coach or (B)usiness class: ", name);
                        ticket_type = input.nextLine().toUpperCase();
                        if (ticket_type.equals("C")) {
                            System.out.printf("MR. %s you chose Chair coach ticket the price is 800 BDT.\nPlease pay your ticket price: ", name);
                            pay = input.nextInt();
                            input.nextLine(); // fix newline bug
                            if (pay == 800) {
                                System.out.printf("MR. %s your payment was successfully done.\nHave a safe and suitable journey from %s to %s \n", name, should_from, should_to);
                            } else {
                                System.out.printf("MR. %s your payment was not successfully done!\n", name);
                            }
                        } else if (ticket_type.equals("B")) {
                            System.out.printf("MR. %s you chose Business class ticket the price is 1600 BDT.\nPlease pay your ticket price: ", name);
                            pay = input.nextInt();
                            input.nextLine(); // fix newline bug
                            if (pay == 1600) {
                                System.out.printf("MR. %s your payment was successfully done.\nHave a safe and suitable journey from %s to %s \n", name, should_from, should_to);
                            } else {
                                System.out.printf("MR. %s your payment was not successfully done!\n", name);
                            }
                        } else {
                            System.out.printf("MR. %s we have only Chair coach & Business class service!!!\n", name);
                        }
                    } else {
                        System.out.printf("MR. %s, we don't have %s route bus, sorry for that!\n", name, should_from);
                    }
                } else {
                    System.out.printf("MR. %s, we don't have %s route bus, sorry for that!\n", name, should_to);
                }
            }
        } else if (gender.toUpperCase().equals("F")) {
            System.out.printf("Hello MRS.%s welcome to Java Ticket Service!\n", name.toUpperCase());
            // For check he/she is student or not
            System.out.printf("%s are you Student (Y)es or (N)o: ", name);
            student = input.nextLine();

            if (student.toUpperCase().equals("Y")) {
                System.out.printf("MRS. %s, we have a student ticket so if you want to buy it then you can get 50%% off.\nDid you want 50%% off (Y)es or (N)o: ", name);
                student_ticket = input.nextLine();
                if (student_ticket.toUpperCase().equals("Y")) {
                    System.out.printf("MRS. %s, where you should go: ", name);
                    should_to = input.nextLine().toUpperCase();
                    if (should_to.toUpperCase().equals("DHAKA")) {
                        System.out.printf("MRS. %s, thank you. So now we have to know about your from place: ", name);
                        should_from = input.nextLine().toUpperCase();
                        if (should_from.toUpperCase().equals("SATKHIRA")) {
                            System.out.printf("MRS. %s which ticket type you want (C)hair coach or (B)usiness class: ", name);
                            ticket_type = input.nextLine().toUpperCase();
                            if (ticket_type.toUpperCase().equals("C")) {
                                System.out.printf("MRS. %s you chose Chair coach ticket the price is 400 BDT.\nPlease pay your ticket price: ", name);
                                pay = input.nextInt();
                                input.nextLine(); // fix newline bug
                                if (pay == 400) {
                                    System.out.printf("MRS. %s your payment was successfully done.\nHave a safe and suitable journey from %s to %s \n", name, should_from, should_to);
                                } else {
                                    System.out.printf("MRS. %s your payment was not successfully done!\n", name);
                                }
                            } else if (ticket_type.equals("B")) {
                                System.out.printf("MRS. %s you chose Business class ticket the price is 800 BDT.\nPlease pay your ticket price: ", name);
                                pay = input.nextInt();
                                input.nextLine(); // fix newline bug
                                if (pay == 800) {
                                    System.out.printf("MRS. %s your payment was successfully done.\nHave a safe and suitable journey from %s to %s \n", name, should_from, should_to);
                                } else {
                                    System.out.printf("MRS. %s your payment was not successfully done!\n", name);
                                }
                            } else {
                                System.out.printf("MRS. %s we have only Chair coach & Business class service!!!\n", name);
                            }
                        } else {
                            System.out.printf("MRS. %s, we don't have %s route bus, sorry for that!\n", name, should_from);
                        }
                    } else {
                        System.out.printf("MRS. %s, we don't have %s route bus, sorry for that!\n", name, should_to);
                    }
                } else {
                    System.out.printf("MRS. %s, where you should go: ", name);
                    should_to = input.nextLine().toUpperCase();
                    if (should_to.equals("DHAKA")) {
                        System.out.printf("MRS. %s, thank you. So now we have to know about your from place: ", name);
                        should_from = input.nextLine().toUpperCase();
                        if (should_from.equals("SATKHIRA")) {
                            System.out.printf("MRS. %s which ticket type you want (C)hair coach or (B)usiness class: ", name);
                            ticket_type = input.nextLine().toUpperCase();
                            if (ticket_type.equals("C")) {
                                System.out.printf("MRS. %s you chose Chair coach ticket the price is 800 BDT.\nPlease pay your ticket price: ", name);
                                pay = input.nextInt();
                                input.nextLine(); // fix newline bug
                                if (pay == 800) {
                                    System.out.printf("MRS. %s your payment was successfully done.\nHave a safe and suitable journey from %s to %s \n", name, should_from, should_to);
                                } else {
                                    System.out.printf("MRS. %s your payment was not successfully done!\n", name);
                                }
                            } else if (ticket_type.equals("B")) {
                                System.out.printf("MRS. %s you chose Business class ticket the price is 1600 BDT.\nPlease pay your ticket price: ", name);
                                pay = input.nextInt();
                                input.nextLine(); // fix newline bug
                                if (pay == 1600) {
                                    System.out.printf("MRS. %s your payment was successfully done.\nHave a safe and suitable journey from %s to %s \n", name, should_from, should_to);
                                } else {
                                    System.out.printf("MRS. %s your payment was not successfully done!\n", name);
                                }
                            } else {
                                System.out.printf("MRS. %s we have only Chair coach & Business class service!!!\n", name);
                            }
                        } else {
                            System.out.printf("MRS. %s, we don't have %s route bus, sorry for that!\n", name, should_from);
                        }
                    } else {
                        System.out.printf("MRS. %s, we don't have %s route bus, sorry for that!\n", name, should_to);
                    }
                }
            } else {
                System.out.printf("MRS. %s, where you should go: ", name);
                should_to = input.nextLine().toUpperCase();
                if (should_to.equals("DHAKA")) {
                    System.out.printf("MRS. %s, thank you. So now we have to know about your from place: ", name);
                    should_from = input.nextLine().toUpperCase();
                    if (should_from.equals("SATKHIRA")) {
                        System.out.printf("MRS. %s which ticket type you want (C)hair coach or (B)usiness class: ", name);
                        ticket_type = input.nextLine().toUpperCase();
                        if (ticket_type.equals("C")) {
                            System.out.printf("MRS. %s you chose Chair coach ticket the price is 800 BDT.\nPlease pay your ticket price: ", name);
                            pay = input.nextInt();
                            input.nextLine(); // fix newline bug
                            if (pay == 800) {
                                System.out.printf("MRS. %s your payment was successfully done.\nHave a safe and suitable journey from %s to %s \n", name, should_from, should_to);
                            } else {
                                System.out.printf("MRS. %s your payment was not successfully done!\n", name);
                            }
                        } else if (ticket_type.equals("B")) {
                            System.out.printf("MRS. %s you chose Business class ticket the price is 1600 BDT.\nPlease pay your ticket price: ", name);
                            pay = input.nextInt();
                            input.nextLine(); // fix newline bug
                            if (pay == 1600) {
                                System.out.printf("MRS. %s your payment was successfully done.\nHave a safe and suitable journey from %s to %s \n", name, should_from, should_to);
                            } else {
                                System.out.printf("MRS. %s your payment was not successfully done!\n", name);
                            }
                        } else {
                            System.out.printf("MRS. %s we have only Chair coach & Business class service!!!\n", name);
                        }
                    } else {
                        System.out.printf("MRS. %s, we don't have %s route bus, sorry for that!\n", name, should_from);
                    }
                } else {
                    System.out.printf("MRS. %s, we don't have %s route bus, sorry for that!\n", name, should_to);
                }
            }
        } else {
            System.out.println("Please select your gender " + name.toUpperCase());
        }
    }
}
