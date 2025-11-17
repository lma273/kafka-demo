/*/ Tạo 2 ứng dụng Spring boot trao đổi dữ liệu (JSON) với nhau thông qua Kafka
- Chạy Kafka
<img width="1838" height="1474" alt="Screenshot 2025-11-17 104731" src="https://github.com/user-attachments/assets/635bcc59-1402-43ff-919e-30e7853a63a8" />
<img width="1665" height="77" alt="Screenshot 2025-11-17 105239" src="https://github.com/user-attachments/assets/38cfd7ef-247b-4d8a-a0f7-c48ea2226352" />

- Producer chạy - serviceA (8080)
<img width="2712" height="1519" alt="Screenshot 2025-11-17 104830" src="https://github.com/user-attachments/assets/7798c8b7-0589-45f2-940b-02b885e4318f" />

- Consumer chạy - serviceB (8081)
<img width="2629" height="1387" alt="Screenshot 2025-11-17 104856" src="https://github.com/user-attachments/assets/4049c381-f849-4611-af21-2171975860f4" />


- Producer gửi message
<img width="2172" height="75" alt="Screenshot 2025-11-17 104926" src="https://github.com/user-attachments/assets/789caddb-87a8-45c8-a626-6d55eac9cea2" />

- Consumer nhận message
<img width="2555" height="1435" alt="Screenshot 2025-11-17 104954" src="https://github.com/user-attachments/assets/70e1c663-42ec-4fbb-a20d-e4d85e3e2f68" />

/*/ Nâng cấp Kafka thành cluster gồm 3 máy
<img width="2851" height="588" alt="Screenshot 2025-11-17 111927" src="https://github.com/user-attachments/assets/14fc01d1-8146-4afc-bc27-f005cf2404fd" />

/*/ Kiểm tra trong 3 máy trong cụm, máy nào làm leader. Dừng máy kafka leader, kiểm tra xem hệ thống có còn hoạt động bình thường không
<img width="2824" height="545" alt="Screenshot 2025-11-17 111946" src="https://github.com/user-attachments/assets/fc43b4be-eb90-44c8-86c9-c0cd5cc86523" />
<img width="876" height="97" alt="Screenshot 2025-11-17 112159" src="https://github.com/user-attachments/assets/41c6129c-3758-4976-971c-3951f05b0f2d" />
<img width="2281" height="294" alt="Screenshot 2025-11-17 112211" src="https://github.com/user-attachments/assets/dc903d9e-5d21-4889-8d73-a6efe1cb832a" />
<img width="1791" height="868" alt="Screenshot 2025-11-17 222210" src="https://github.com/user-attachments/assets/8b9597eb-9dcf-485c-8b44-953595e25e54" />
<img width="2533" height="159" alt="Screenshot 2025-11-17 222154" src="https://github.com/user-attachments/assets/39627b49-70b8-4173-a521-efd55a48c36b" />





