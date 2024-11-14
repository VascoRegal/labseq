package org.acme;

import java.util.HashMap;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LabSeqService {
    
    private HashMap<Integer, Integer> cache = new HashMap<>();

    public int calculateLabSeq(int n) {
        if (this.cache.containsKey(n)) {
            return cache.get(n);
        }

        int ret;

        if (n == 0 || n == 2) {
            ret = 0;
        } else if (n == 1 || n == 3) {
            ret = 1;
        } else {
            ret = calculateLabSeq(n - 4) + calculateLabSeq(n - 3);
        }

        if (!this.cache.containsKey(n)) {
            this.cache.put(n, ret);
        }
        return ret;
    }
}
