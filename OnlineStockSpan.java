class StockSpanner {
    private List<Integer> list = new ArrayList<>();
    private List<Integer> prev = new ArrayList<>();

    public int next(int price) {
        list.add(price);
        int i = list.size() - 2;
        while (!prev.isEmpty() && i >= 0 && list.get(i) <= price) i = prev.get(i);
        prev.add(i);
        return list.size() - 1 - i;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
