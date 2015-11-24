package org.dasein.cloud.utils.retrypolicy.retry;

/**
 * Created by vmunthiu on 11/23/2015.
 */
public class RetryPolicyStateWithCount implements RetryPolicyState {
    private int errorCount;
    private int retryCount;

    public RetryPolicyStateWithCount(int retryCount) {
        this.retryCount = retryCount;
    }

    @Override
    public boolean canRetry(Exception ex) {
        this.errorCount += 1;

        return errorCount <= retryCount;
    }
}
