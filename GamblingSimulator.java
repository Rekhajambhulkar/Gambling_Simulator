package com.bridgelabz.gamblingsimulator;

public class GamblingSimulator
{
//CONSTANTS
public static final int bet = 1;
public static final int stake = 100;

public void winORLoss()
{
int win=1;
int random = (int) (Math.random() * 10 )% 2;
if(win == random ) {
	System.out.println("Win");
}
else {
	System.out.println("Loss");
}
}
public static void main(String args[])
{
System.out.println("Welcome in Gambling Simulator program");
GamblingSimulator gam = new GamblingSimulator();
gam.winORLoss();
}
}
