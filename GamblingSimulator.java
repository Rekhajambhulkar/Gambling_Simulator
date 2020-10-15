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
public static void resignGame(){
int cash = stake;
int win=1;
int take=150;
int Goal=50;
int range=50;
while(cash < take  && cash > Goal){	
if (win == range ) {
	int random = (int) (Math.random() * 10 )% 2;
	cash = cash + bet;
}
else {
	cash = cash - bet;	
}
}
if(stake == Goal)
{
	System.out.println("Win");
}
else {
	System.out.println("Loose");
}
}
public static void main(String args[])
{
System.out.println("Welcome in Gambling Simulator program");
GamblingSimulator gam = new GamblingSimulator();
winORLoss();
resignGame();
}
}
