public class SnapshotArray {
    private final int[] array;
    private final HashMap<Integer, HashMap<Integer, Integer>> snapshots = new HashMap<>();
    private final HashMap<Integer, Integer> currentChanges = new HashMap<>();
    private int current_snap_id = 0;

    public SnapshotArray(int length) {
        this.array = new int[length];
    }

    public void set(int index, int val) {
        currentChanges.put(index, val);
        array[index] = val;
    }

    public int snap() {
        HashMap<Integer, Integer> clonedChanges = new HashMap<>(currentChanges);
        snapshots.put(current_snap_id, clonedChanges);

        return current_snap_id++;
    }

    public int get(int index, int snap_id) {
        return snapshots.get(snap_id).getOrDefault(index, 0);
    }
}
/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
