package com.Bridgelabz.DataStructure;
public class CalendarWithQueue 
	{
	public Queue weekDayWithQueue(String[][] arr){   //take the week of the day using queue 
				Queue queue = new Queue();   //created object of queue
				for(int i=0; i<7; i++) {    //check the week of day using for loop
					for(int j=0; j<7; j++) {
						queue.enqueue(arr[i][j]);  //enqueue the week of the day using array
					}
				}
				return queue;
			}
			 
			public void display(Queue queue) {  //display the queue
				int size = queue.size();  //check the size of queue and its return type is int
				for(int i=0; i<=size; i++) {  //check the size of ith element
					if(i%7==0) System.out.println();   
					String str = (String)queue.dequeue();
					if(str==null) break;
					System.out.print(str+"   ");
				}
			}
			
			public static void main(String args[]) {
				CalendarWithQueue calendar = new CalendarWithQueue();  //created object of class
				Calendar cal = new Calendar();   //created object of calender
				String arr[][] = cal.calendar(2019,3);  //passed the value of year and month
//				cal.display(arr);
				Queue queue = calendar.weekDayWithQueue(arr); //called the calender using weekdaywidqueue class
				calendar.display(queue); //and display the queue
			}
		}
	