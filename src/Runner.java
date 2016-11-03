import java.util.*;
public class Runner
	{
		static int counter = 0;
		static int counter2 = 0;
		public static void main(String[] args) throws InterruptedException
			{
				ArrayList<Integer> nums = new ArrayList<Integer>();
				ArrayList<Integer> nums2 = new ArrayList<Integer>();
				Scanner input = new Scanner(System.in);
				boolean in = true;
				int index = 0;
				System.out.println("Please type in a list on integers with numbers all between 1 and 20. Make sure to press the enter key after each integer and type a -1 after your last integer");
				while (in)
					{
						int num = input.nextInt();
						if (num < 21 && num > 0)
							{
								nums.add(num);
								nums2.add(index);
								index++;
							}
						else if(num == -1)
							{
								in = false;
							}
						else
							{
								System.out.println("That number is not in the range, please type in another number");
							}
					}
				Collections.sort(nums);
				System.out.println("Your sorted array:");
				System.out.print(nums.get(0));
				for(int i = 1; i < nums.size(); i++){
				      System.out.printf("%3s", nums.get(i));
				   }
				System.out.println();
				System.out.print(nums2.get(0));
				for(int i = 1; i < nums2.size(); i++){
				      System.out.printf("%3s", nums2.get(i));
				   }
				System.out.println();
				System.out.println("Indices of the array ^^^");
				int ran = (int) (Math.random()*nums.size());
				int target = nums.get(ran);
				System.out.println();
				Thread.sleep(750);
				System.out.println("Your target is " + nums.get(ran));
				Thread.sleep(750);
				System.out.println();
				binarySearch(nums, target);
				System.out.println("You got " + counter + " out of " + counter2 + " correct");
			}
		public static int binarySearch(ArrayList<Integer> elements, int target)
			{
				Scanner input2 = new Scanner(System.in);
				int inp = 0;
				int left = 0;
				int right = elements.size() - 1;
				int pass = 1;
				while (left <= right)
					{
						System.out.println("Pass #" + pass);
						pass++;
						System.out.println("What does left equal");
						inp = input2.nextInt();
						if (inp == left)
							{
								System.out.println("That is correct");
								counter2++;
								counter++;
							}
						else
							{
								counter2++;
								System.out.println("That is incorrect");
							}
						System.out.println("What does right equal");
						inp = input2.nextInt();
						if (inp == right)
							{
								System.out.println("That is correct");
								counter2++;
								counter++;
							}
						else
							{
								counter2++;
								System.out.println("That is incorrect");
							}
						int mid = (left + right) / 2;
						System.out.println("What does mid equal");
						inp = input2.nextInt();
						if (inp == mid)
							{
								System.out.println("That is correct");
								counter2++;
								counter++;
							}
						else
							{
								counter2++;
								System.out.println("That is incorrect");
							}
						System.out.println("What does nums[mid] equal");
						inp = input2.nextInt();
						if (inp == elements.get(mid))
							{
								System.out.println("That is correct");
								counter2++;
								counter++;
							}
						else
							{
								counter2++;
								System.out.println("That is incorrect");
							}
						if (target == elements.get(mid))
							{
								System.out.println("You found the value");
								return mid;
							}
						if (target < elements.get(mid))
							{
								right = mid - 1;
							}
						else
							{
								left = mid + 1;
							}
					}
				return -1;
			 }
	}
