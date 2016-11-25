package com.jensen.model;

	import java.util.Random;
	
	public class Dice {

		private Random rand;
		private int faceValue;
		private int[] dieArr;
		
		//the constructors
		public Dice() {
			this.faceValue = rand.nextInt(6)+1;
		}
		
		public Dice(int size)
		{
			this.dieArr = new int[size];
			for (int i = 0; i < size; ++i)
				this.dieArr[i] = rand.nextInt(6) + 1;
		}

		//getters
		public int getDie() {
			return this.faceValue;
		}
		
		public int[] getDieArr() {
			return this.dieArr;
		}

	}

