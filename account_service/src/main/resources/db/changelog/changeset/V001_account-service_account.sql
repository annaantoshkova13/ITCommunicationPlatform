CREATE TABLE IF NOT EXISTS accounts (
                                        id BIGSERIAL PRIMARY KEY,
                                        user_id BIGINT NOT NULL,
                                        account_number VARCHAR(50) NOT NULL UNIQUE,
    balance DECIMAL(19,2) NOT NULL DEFAULT 0,
    currency VARCHAR(3) NOT NULL DEFAULT 'USD',
    status VARCHAR(20) NOT NULL DEFAULT 'ACTIVE',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
    );

CREATE INDEX IF NOT EXISTS idx_accounts_user_id ON accounts(user_id);
CREATE INDEX IF NOT EXISTS idx_accounts_account_number ON accounts(account_number);

COMMENT ON TABLE accounts IS 'Table storing user account information';
COMMENT ON COLUMN accounts.id IS 'Primary key, auto-incrementing';
COMMENT ON COLUMN accounts.user_id IS 'Reference to user ID from user service';
COMMENT ON COLUMN accounts.account_number IS 'Unique account number';
COMMENT ON COLUMN accounts.balance IS 'Current account balance';
COMMENT ON COLUMN accounts.currency IS 'Account currency (USD, EUR, etc.)';
COMMENT ON COLUMN accounts.status IS 'Account status: ACTIVE, FROZEN, CLOSED';
