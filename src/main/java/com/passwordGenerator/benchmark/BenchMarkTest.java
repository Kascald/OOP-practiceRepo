//package com.passwordGenerator.benchmark;
//
//
//import org.openjdk.jmh.annotations.*;
//import java.util.concurrent.TimeUnit;
//
//@BenchmarkMode(Mode.SingleShotTime)
//@OutputTimeUnit(TimeUnit.MILLISECONDS)
//@Measurement(batchSize = 100000, iterations = 5)
//@Warmup(batchSize = 100000, iterations = 5)
//@State(Scope.Thread)
//public class BenchMarkTest {
//	String stringForLength = "aaaabbb";
//
//	@Benchmark
//	public Boolean compareTest() {
//		return stringForLength.length() < 8 || stringForLength.length() > 12;
//	}
//
//	@Benchmark
//	public Boolean compareSecondTest() {
//		return stringForLength.length() <= 7 || stringForLength.length() >= 13;
//	}
//
//}
