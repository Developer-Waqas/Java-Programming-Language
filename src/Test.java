class Test {

    int data = 50;
    private int dataPrivate = 100;

    public void setPrivateData(int pData) {
        dataPrivate = pData;
        System.out.println("Private Data = " + pData);
    }

    public int getPrivateData() {
        return dataPrivate;
    }

}