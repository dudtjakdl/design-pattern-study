package patterns.creational.factory_method.chpark;

/**
 * 자동차 정보를 담는 데이터 클래스
 */
public class CarInfo {
    private String carName;        // 차량명
    private int productionYear;    // 생산연도
    private String carCode;        // 차량코드
    private String userName;       // 사용자명
    private String brand;          // 브랜드 (현대, 기아, 제네시스)

    public CarInfo(String brand, String carName, int productionYear, String carCode, String userName) {
        this.brand = brand;
        this.carName = carName;
        this.productionYear = productionYear;
        this.carCode = carCode;
        this.userName = userName;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getCarName() {
        return carName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCarCode() {
        return carCode;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s - %d년생산, 코드:%s, 소유자:%s",
                brand, carName, productionYear, carCode, userName);
    }
}

