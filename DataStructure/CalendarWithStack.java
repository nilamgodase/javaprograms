/******************************************************************************
 *  Compilation:  javac -d bin CalendarWithStack.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose:Calendar with Stack
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since  03-02-2019
 *
 ******************************************************************************/

package com.Bridgelabz.DataStructure;
import java.util.Stack;

public class CalendarWithStack {

		Stack stack1 = new Stack(); //created object of stack

		public void calendarWithStack(Queue queue) { //declared the method using queue
			stack1.push(queue);  //push the statck in queue
		}
		
		public Stack transferFromOneStackToOther() { //declared the method for transforming one element to another stack
			int size = stack1.size();  //take the size of stack with return type is integer
			Stack stack2 = new Stack();   //created object of second stack
			for(int i=0; i<size; i++) {
				stack2.push(stack1.peek()); //again push the top of element in stack using peak method in stack 
			}
			return stack2;
		}
		
		public static void main(String args[]) {
			Calendar calendar = new Calendar();
			//String[][] s1=calendar.calendar(2019, 1);
			//String[][] s2=calendar.calendar(2019, 2);
			String[][] s3=calendar.calendar(2019, 3);  //called the calendar with return type array
			CalendarWithQueue calendarWithQueue = new CalendarWithQueue(); //created the object of calendarwidqueue class
			//Queue q1 = calendarWithQueue.weekDayWithQueue(s1);
			//Queue q2 = calendarWithQueue.weekDayWithQueue(s2);
			Queue q3 = calendarWithQueue.weekDayWithQueue(s3);
			CalendarWithStack calendarWithStack = new CalendarWithStack(); //calender with stack
			//calendarWithStack.calendarWithStack(q1);
			//calendarWithStack.calendarWithStack(q2);
			calendarWithStack.calendarWithStack(q3);
			Stack stack = calendarWithStack.transferFromOneStackToOther();
			Queue qu1 = (Queue)stack.peek();  //peek the top of number in queue using stack
			Queue qu2 = (Queue)stack.peek();
			Queue qu3 = (Queue)stack.peek();
			//calendarWithQueue.display(qu1);
			//calendarWithQueue.display(qu2);
	        calendarWithQueue.display(qu3); //display the calender

		}
	}


