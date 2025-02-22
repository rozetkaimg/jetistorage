//
// Created by Stanislav Klepikov on 23.02.2025.
//
//ZZZZZZZZZZZZZZZOV
//goida
#include "rcs64.h"

#include <iostream>
#include <sstream>

RCS64::RCS64(const std::string &key) {
    std::stringstream ss(key);
    ss >> key_;
}

uint64_t RCS64::encryptBlock(uint64_t block) {
    block = block ^ key_;
    block = (block << 13) | (block >> 51);
    block = block + key_;
    return block;
}

uint64_t RCS64::decryptBlock(uint64_t block) {
    block = block - key_;
    block = (block >> 13) | (block << 51);
    block = block ^ key_;
    return block;
}

std::string RCS64::encrypt(const std::string &plaintext) {
    std::string padded_plaintext = plaintext;
    while (padded_plaintext.length() % 8 != 0) {
        padded_plaintext += '\0';
    }

    std::string ciphertext = "";
    for (size_t i = 0; i < padded_plaintext.length(); i += 8) {
        uint64_t block = 0;
        for (size_t j = 0; j < 8; j++) {
            block = (block << 8) | padded_plaintext[i + j];
        }
        uint64_t encrypted_block = encryptBlock(block);
        for (size_t j = 0; j < 8; j++) {
            ciphertext += (char) (encrypted_block >> (56 - j * 8));
        }
    }

    return ciphertext;
}

std::string RCS64::decrypt(const std::string &ciphertext) {
    std::string plaintext = "";
    for (size_t i = 0; i < ciphertext.length(); i += 8) {
        uint64_t block = 0;
        for (size_t j = 0; j < 8; j++) {
            block = (block << 8) | ciphertext[i + j];
        }
        uint64_t decrypted_block = decryptBlock(block);
        for (size_t j = 0; j < 8; j++) {
            plaintext += (char) (decrypted_block >> (56 - j * 8));
        }
    }

    while (plaintext.back() == '\0') {
        plaintext.pop_back();
    }

    return plaintext;
}