class Solution {
    public int totalFruit(int[] fruits) {
       Map<Integer, Integer> fruitCount = new HashMap<>();
        int maxFruits = 0;
        int j = 0;

        for (int i = 0; i < fruits.length; i++) {
            fruitCount.put(fruits[i], fruitCount.getOrDefault(fruits[i], 0) + 1);

            while (fruitCount.size() > 2) {
                fruitCount.put(fruits[j], fruitCount.get(fruits[j]) - 1);
                if (fruitCount.get(fruits[j]) == 0) {
                    fruitCount.remove(fruits[j]);
                }
                j++;
            }

            maxFruits = Math.max(maxFruits, i - j + 1);
        }
        return maxFruits;

       } 
    }
