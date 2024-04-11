package Package;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class Process {
	Scanner scanner = new Scanner(System.in);

	public String Start(int Array[]) {
		out.println("현재 배열은 이렇습니다: " + Arrays.toString(Array));
		out.println("Index[i]의 value를 가져오고 싶으면 get, 마지막 Index에 value를 추가하고 싶으면 add, Index[i]를 삭제하고 싶으면 del, Index[i]의 value를 변경하고 싶으면 replace를 입력해주세요: ");
		String TaskSelect = scanner.next();
		return TaskSelect;
	}

	public void Get(int Array[]) {
		out.println("value를 가져올 Index[i]의 i를 입력해주세요: ");
		int i = scanner.nextInt();
		out.println("Index[" + i + "]의 value는 " + Array[i] + "입니다. ");
	}

	public void Add(int Array[]) {
		out.println("마지막 Index에 추가할 value를 입력해주세요: ");
		int i = scanner.nextInt();
		int newArray[] = new int[Array.length + 1];
		for(int a=0;a<Array.length;a++)	newArray[a]=Array[a];
		newArray[newArray.length-1] = i;
		out.println("추가된 배열은 이렇습니다: " + Arrays.toString(newArray));
		return;
	}

	public void Del(int Array[]) {
		out.println("삭제할 Index[i]의 i를 입력해주세요: ");
		int i = scanner.nextInt();
		int newArray[] = new int[Array.length - 1];
		for(int a=0;a<i;a++)	newArray[a]=Array[a];
		for (int a = i; a < Array.length - 1; a++)	newArray[a] = Array[a + 1];
		out.println("삭제된 배열은 이렇습니다: " + Arrays.toString(newArray));
		return;
	}

	public void Replace(int Array[]) {
		out.println("변경할 Index[i]의 i를 입력해주세요: ");
		int i = scanner.nextInt();
		out.println("Index[" + i + "]의 value를 무엇으로 변경하시겠습니까? ");
		int value = scanner.nextInt();
		Array[i] = value;
		out.println("변경된 배열은 이렇습니다: " + Arrays.toString(Array));
		return;
	}
}
