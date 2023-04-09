public class Laptop {
    private String laptop;
    private String operatingSystem;
    private String cpu;
    private int cpuFrequency;
    private double screenSize;
    private String displayTechnology;
    private String videoCard;
    private int VideoMemorySize;
    private int ram;
    private int ramFrequency;
    private String ramTipe;
    private String driveType;
    private int ssdSize;
    private int powerSupplyPower;
    private int maxRunTime;
    private String caseMaterial;
    private String color;
    private double cost;

    @Override
    public String toString() {
        return "Ноутбук " + laptop + ":" + "[ Операционная система = " + operatingSystem + ", Процессор = " + cpu
                + ", Частота процессора = " + cpuFrequency + " МГц" + ", Размер экрана = " + screenSize + "'"
                + ", Технология дисплея = " + displayTechnology
                + ", Видеокарта = " + videoCard + ", Объем видеопамяти = " + VideoMemorySize + " Гб"
                + ", Объем оперативной памяти = " + ram
                + " Гб" + ", Частота оперативной памяти = " + ramFrequency + ", Тип оперативной памяти = " + ramTipe + ", Тип накопителя = " + driveType
                + ", Объем SSD = " + ssdSize + " Гб" + ", Мощность блока питания = " + powerSupplyPower + " Вт"
                + ", Максимальное время работы = " + maxRunTime + " ч" + ", Материал корпуса = "
                + caseMaterial + ", Цвет = " + color + "]\n" + "Цена:" + cost + " руб\n";
    }

    // public void NoteBook(String laptop, String operatingSystem, String cpu, int cpuFrequency,
    //         double screenSize, String displayTechnology, String videoCard, int VideoMemorySize, int ram,
    //         int ramFrequency, String ramTipe, String driveType, int ssdSize, int powerSupplyPower, int maxRunTime,
    //         String caseMaterial, String color, double cost) {
    //     this.laptop = laptop;
    //     this.operatingSystem = operatingSystem;
    //     this.cpu = cpu;
    //     this.cpuFrequency = cpuFrequency;
    //     this.screenSize = screenSize;
    //     this.displayTechnology = displayTechnology;
    //     this.videoCard = videoCard;
    //     this.VideoMemorySize = VideoMemorySize;
    //     this.ram = ram;
    //     this.ramFrequency = ramFrequency;
    //     this.ramTipe = ramTipe;
    //     this.driveType = driveType;
    //     this.ssdSize = ssdSize;
    //     this.powerSupplyPower = powerSupplyPower;
    //     this.maxRunTime = maxRunTime;
    //     this.caseMaterial = caseMaterial;
    //     this.color = color;
    //     this.cost = cost;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((laptop == null) ? 0 : laptop.hashCode());
        result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
        result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
        result = prime * result + cpuFrequency;
        long temp;
        temp = Double.doubleToLongBits(screenSize);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((displayTechnology == null) ? 0 : displayTechnology.hashCode());
        result = prime * result + ((videoCard == null) ? 0 : videoCard.hashCode());
        result = prime * result + VideoMemorySize;
        result = prime * result + ram;
        result = prime * result + ramFrequency;
        result = prime * result + ((ramTipe == null) ? 0 : ramTipe.hashCode());
        result = prime * result + ((driveType == null) ? 0 : driveType.hashCode());
        result = prime * result + ssdSize;
        result = prime * result + powerSupplyPower;
        result = prime * result + maxRunTime;
        result = prime * result + ((caseMaterial == null) ? 0 : caseMaterial.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        temp = Double.doubleToLongBits(cost);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (laptop == null) {
            if (other.laptop != null)
                return false;
        } else if (!laptop.equals(other.laptop))
            return false;
        if (operatingSystem == null) {
            if (other.operatingSystem != null)
                return false;
        } else if (!operatingSystem.equals(other.operatingSystem))
            return false;
        if (cpu == null) {
            if (other.cpu != null)
                return false;
        } else if (!cpu.equals(other.cpu))
            return false;
        if (cpuFrequency != other.cpuFrequency)
            return false;
        if (Double.doubleToLongBits(screenSize) != Double.doubleToLongBits(other.screenSize))
            return false;
        if (displayTechnology == null) {
            if (other.displayTechnology != null)
                return false;
        } else if (!displayTechnology.equals(other.displayTechnology))
            return false;
        if (videoCard == null) {
            if (other.videoCard != null)
                return false;
        } else if (!videoCard.equals(other.videoCard))
            return false;
        if (VideoMemorySize != other.VideoMemorySize)
            return false;
        if (ram != other.ram)
            return false;
        if (ramFrequency != other.ramFrequency)
            return false;
        if (ramTipe == null) {
            if (other.ramTipe != null)
                return false;
        } else if (!ramTipe.equals(other.ramTipe))
            return false;
        if (driveType == null) {
            if (other.driveType != null)
                return false;
        } else if (!driveType.equals(other.driveType))
            return false;
        if (ssdSize != other.ssdSize)
            return false;
        if (powerSupplyPower != other.powerSupplyPower)
            return false;
        if (maxRunTime != other.maxRunTime)
            return false;
        if (caseMaterial == null) {
            if (other.caseMaterial != null)
                return false;
        } else if (!caseMaterial.equals(other.caseMaterial))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
            return false;
        return true;
    }

    public String getLaptop() {
        return laptop;
    }

    public double getCost() {
        return cost;
    }

    public String getCaseMaterial() {
        return caseMaterial;
    }

    public String getColor() {
        return color;
    }

    public String getCpu() {
        return cpu;
    }

    public int getCpuFrequency() {
        return cpuFrequency;
    }

    public String getDisplayTechnology() {
        return displayTechnology;
    }

    public String getDriveType() {
        return driveType;
    }

    public int getMaxRunTime() {
        return maxRunTime;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getPowerSupplyPower() {
        return powerSupplyPower;
    }

    public int getRam() {
        return ram;
    }

    public String getRamTipe() {
        return ramTipe;
    }

    public int getRamFrequency() {
        return ramFrequency;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getSsdSize() {
        return ssdSize;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public int getVideoMemorySize() {
        return VideoMemorySize;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    public void setCaseMaterial(String caseMaterial) {
        this.caseMaterial = caseMaterial;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setCpuFrequency(int cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public void setDisplayTechnology(String displayTechnology) {
        this.displayTechnology = displayTechnology;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public void setMaxRunTime(int maxRunTime) {
        this.maxRunTime = maxRunTime;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setPowerSupplyPower(int powerSupplyPower) {
        this.powerSupplyPower = powerSupplyPower;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setRamFrequency(int ramFrequency) {
        this.ramFrequency = ramFrequency;
    }

    public void setScreenSize(double d) {
        this.screenSize = d;
    }

    public void setSsdSize(int ssdSize) {
        this.ssdSize = ssdSize;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public void setVideoMemorySize(int videoMemorySize) {
        VideoMemorySize = videoMemorySize;
    }

    public void setRamTipe(String ramTipe) {
        this.ramTipe = ramTipe;
    }
}
