# StudentHub - 學生資料管理系統

**學生資料管理應用程式** - 一個簡潔易用的Android應用程式，專為管理學生基本資料而設計。此應用程式提供了完整的學生資料CRUD（新增、讀取、更新、刪除）功能，包括姓名、身高和頭像管理。

## 📱 專案概述

**StudentHub** 是一個使用Android原生Java開發的學生資料管理應用程式。它採用現代化的Material Design設計語言，提供直觀的用戶界面和流暢的操作體驗。

### ✨ 主要功能

- **📋 學生資料列表顯示**：使用RecyclerView展示所有學生資料
- **➕ 新增學生資料**：支援輸入姓名、身高和頭像URL
- **✏️ 編輯學生資料**：點擊任意學生項目即可進行編輯
- **🖼️ 網路圖片載入**：使用Glide庫載入和快取網路圖片
- **📱 響應式設計**：適配不同螢幕尺寸的Android裝置

### 🛠️ 技術規格

- **開發語言**：Java
- **最低Android版本**：API 31 (Android 12.0)
- **目標Android版本**：API 34 (Android 14.0)
- **編譯工具**：Gradle 8.2
- **架構模式**：MVC (Model-View-Controller)

### 📚 使用的技術和庫

- **AndroidX AppCompat**：向後兼容性支持
- **Material Design Components**：現代化UI元件
- **RecyclerView**：高效的列表顯示
- **ConstraintLayout**：靈活的布局管理
- **Glide 4.12.0**：圖片載入和快取
- **ActivityResultAPI**：現代化的Activity間數據傳遞

## 🏗️ 專案結構

```
app/src/main/java/com/example/test0508/
├── MainActivity.java          # 主頁面 - 顯示學生列表
├── AddDataActivity.java       # 新增資料頁面
├── UpdateActivity.java        # 更新資料頁面
├── StuData.java              # 學生資料模型類
├── StuDataAdapter.java       # RecyclerView適配器
└── MyDataView.java           # 資料顯示視圖

app/src/main/res/
├── layout/
│   ├── activity_main.xml         # 主頁面布局
│   ├── activity_add_data.xml     # 新增頁面布局
│   ├── activity_update.xml       # 更新頁面布局
│   └── activity_my_data_view.xml # 單項資料布局
├── values/
│   ├── strings.xml               # 字串資源
│   ├── colors.xml                # 顏色資源
│   └── themes.xml                # 主題配置
└── drawable/                     # 圖片資源
```

## 🚀 安裝和運行

### 前置需求

- **Android Studio** Arctic Fox 或更新版本
- **JDK 8** 或更新版本
- **Android SDK API 31** 或更高版本
- **Gradle 8.2** 或更新版本

### 安裝步驟

1. **複製專案**
   ```bash
   git clone [repository-url]
   cd StudentHub
   ```

2. **開啟專案**
   - 使用Android Studio開啟專案資料夾
   - 等待Gradle同步完成

3. **配置SDK**
   - 確保已安裝Android SDK API 31-34
   - 配置適當的JDK版本

4. **運行專案**
   - 連接Android裝置或啟動模擬器
   - 點擊「Run」按鈕或按下 `Shift + F10`

## 📖 使用說明

### 主要操作流程

1. **查看學生列表**
   - 應用程式啟動後會顯示預設的學生資料列表
   - 每個項目包含頭像、姓名和身高資訊

2. **新增學生資料**
   - 點擊主頁面的「新增」按鈕
   - 輸入學生姓名、身高和頭像URL
   - 點擊確認按鈕保存資料

3. **編輯學生資料**
   - 點擊列表中任意學生項目
   - 修改相應的資訊
   - 點擊確認按鈕保存變更

4. **圖片顯示**
   - 支援載入網路圖片URL
   - 自動快取圖片以提升載入速度

## 🎯 核心功能特點

### 數據管理
- 使用ArrayList進行內存數據管理
- 實現完整的CRUD操作
- 支持動態數據更新和UI刷新

### 用戶界面
- Material Design設計風格
- 響應式布局適配
- 流暢的頁面切換動畫

### 圖片處理
- Glide圖片載入庫集成
- 支援網路圖片和本地圖片
- 自動圖片快取和記憶體管理

## 🔧 開發配置

### Gradle依賴

```gradle
dependencies {
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.11.0'
    implementation 'androidx.recyclerview:recyclerview:1.3.2'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
}
```

### 權限設置

```xml
<uses-permission android:name="android.permission.INTERNET" />
```

## 🤝 貢獻指南

歡迎提交問題報告、功能建議或代碼貢獻！

1. Fork 此專案
2. 創建您的功能分支 (`git checkout -b feature/AmazingFeature`)
3. 提交您的變更 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 開啟一個Pull Request

**StudentHub** - 讓學生資料管理變得簡單高效！ 📚✨
