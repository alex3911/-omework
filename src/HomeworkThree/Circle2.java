package HomeworkThree;

import java.util.Scanner;
import java.util.Random;

public class Circle2 {
	public static void main(String[] args) {
			// ������ ������� � ������ ���������� �������
		System.out.println ("������ ������ 1-�� ����������");
		Scanner a = new Scanner(System.in);
		int r1 = a .nextInt();
		System.out.println ("������ ������ 2-�� ����������");
		Scanner b = new Scanner(System.in);
		int r2 = b .nextInt();
		System.out.println ("������ ���������� x ������ ����������");
		Scanner c = new Scanner(System.in);
		int x1 = c .nextInt();
		System.out.println ("������ ���������� y ������ ����������");
		Scanner d = new Scanner(System.in);
		int y1 = d .nextInt();
		// ���������� ������ ������� ����� ���������� ��������
		Random rand = new Random();
		int x2 = -99 + rand.nextInt(198);
		int y2 = -99 + rand.nextInt(198);
		
		double cl = CircleLength(r1);
		System.out.println ("������ ���������� �����   " + cl);	
		
		double dc = DistCirc (x1, x2, y1, y2);
		System.out.println ("��������� ����� �������� ����������� �����  " + dc);
		
		// �� �� ���� �������� � �� ��������� ����� ��� ������� 2 �������� ������ �����.
	//���� �������� ������. Verification 
		int vf = Verification (dc, r1, r2);
		if (vf == 0) System.out.println ("���������� �� ������������");
		else System.out.println ("���������� ������������");
			}
	

	// ������� ����� ���������� ������ ����������
	private static double CircleLength(int r1) {
		double f = Math.PI;
		double g = 2*f*r1;
		return g;
		}
	
	// ������� ����� ���������� ��������� ����� �������� �����������
	private static double DistCirc(int x1, int x2, int y1, int y2) {
		int f = 2;
		double l = Math.sqrt (Math.pow((x2-x1), f) + Math.pow((y2 - y1), f));
		return l;
	}
	
		// �������� ������
	private static int Verification (double dc, int r1, int r2) {
		int h;
		if ((r1+r2) < dc & (r1 - r2) > dc) h = 0;
		else h = 1;
		return h;
	}
	}
