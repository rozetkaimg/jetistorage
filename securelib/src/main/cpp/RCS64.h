//
// Created by Klepi on 23.02.2025.
//

#ifndef MY_APPLICATION_RCS64_H
#define MY_APPLICATION_RCS64_H

#include <cstdint>
#include <string>

class RCS64 {
public:
    RCS64(const std::string &key);

    std::string encrypt(const std::string &plaintext);

    std::string decrypt(const std::string &ciphertext);

private:
    uint64_t key_;

    uint64_t encryptBlock(uint64_t block);

    uint64_t decryptBlock(uint64_t block);
};

#endif