CREATE TABLE report (
    id SERIAL PRIMARY KEY,
    status VARCHAR(255),
    message TEXT,
    bill_amount DECIMAL
);