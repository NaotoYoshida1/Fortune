package com.example.demo;

import java.util.Random;

public class Fortune {
	private String fortune;

	public String getFortune() {
		return fortune;
	}

	public String calc() {
		// 0から3までの範囲で乱数を1つ生成する
		Random rand = new Random();
		int no = rand.nextInt(12);

		// 取得した乱数の値によって、結果を表示する
		if (no < 3) {
			fortune = ("大吉");
		} else if (no < 9) {
			fortune = ("中吉");
		} else if (no < 11) {
			fortune = ("末吉");
		} else {
			fortune = ("凶");
		}
		return fortune;
	}

	Fortune() {

	}
}
