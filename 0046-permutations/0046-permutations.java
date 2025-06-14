class Solution {
public void dfs(List<List<Integer>> results, List<Integer> prevElements, List<Integer> elements) {
    System.out.println("DFS 호출 => prev: " + prevElements + ", elements: " + elements);

    // leaf node
    if (elements.isEmpty()) {
        System.out.println("\U0001f4a1 리프 노드 도달! 순열 완성: " + prevElements);
        results.add(new ArrayList<>(prevElements));  // 복사해서 저장
        return;
    }

    // elements 가 남아 있을 때
    for (Integer e : elements) {
        System.out.println("\U0001f449 선택: " + e);
        
        List<Integer> nextElements = new ArrayList<>(elements);
        nextElements.remove(e);

        prevElements.add(e);

        dfs(results, prevElements, nextElements);

        // 되돌리기
        System.out.println("\U0001f519 백트래킹: " + e + " 제거 전 prev: " + prevElements);
        prevElements.remove(e);
        System.out.println("\U0001f504 이후 prev 복구됨: " + prevElements);
    }
}

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        List<Integer> lst = Arrays.stream(nums).boxed().collect(Collectors.toList());

        dfs(results, new ArrayList<>(), lst);

        return results;
    }
}