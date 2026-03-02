CREATE TABLE IF NOT EXISTS payments (
                                        id BIGSERIAL PRIMARY KEY,
                                        user_id BIGINT NOT NULL,
                                        amount DECIMAL(19,2) NOT NULL,
    currency VARCHAR(3) NOT NULL,
    status VARCHAR(50) NOT NULL,
    payment_method VARCHAR(50),
    transaction_id VARCHAR(255) UNIQUE,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

CREATE TABLE IF NOT EXISTS invoices (
                                        id BIGSERIAL PRIMARY KEY,
                                        payment_id BIGINT REFERENCES payments(id) ON DELETE CASCADE,
    invoice_number VARCHAR(255) NOT NULL UNIQUE,
    invoice_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    pdf_url TEXT
    );

CREATE TABLE IF NOT EXISTS refunds (
                                       id BIGSERIAL PRIMARY KEY,
                                       payment_id BIGINT REFERENCES payments(id) ON DELETE CASCADE,
    amount DECIMAL(19,2) NOT NULL,
    reason TEXT,
    status VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );