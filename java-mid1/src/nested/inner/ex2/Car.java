package nested.inner.ex2;

public class Car {

	private String model;
	private int chargeLevel;
	private Engine engine;

	public Car(String model, int chargeLevel) {
		this.model = model;
		this.chargeLevel = chargeLevel;
		this.engine = new Engine();		//new Engine(this);
	}

	// ■내부 클래스 사용으로 인해 이 메서드도 필요 없어졌다.
	// Engine에서만 사용하는 메서드
//	public String getModel() {
//		return model;
//	}

	// Engine에서만 사용하는 메서드
//	public int getChargeLevel() {
//		return chargeLevel;
//	}

	public void start(){
		engine.start();
		System.out.println(model + " 시작 완료");
	}

	// ■리팩토링 적용
	private class Engine {
		// ■이제는 더이상 Engine 클래스에서 Car 정보(필드)를 가질 필요가 없다.
		// ■왜냐하면 Engine은 Car의 내부 클래스로써 Car의 정보를 모두 알기 때문이다.
//		private Car car;

//		public Engine(nested.inner.ex1.Car car) {
//			this.car = car;
//		}

		public void start(){
			System.out.println("충전 레벨 확인: " + chargeLevel);		//System.out.println("충전 레벨 확인: " + car.getChargeLevel());
			System.out.println(model + "의 엔진을 구동합니다.");		//System.out.println(car.getModel() + "의 엔진을 구동합니다.");
		}

	}

}
